import java.util.Scanner;

public class Withdraw {
    static String s = "";
    static String sufficient =" the ";
    static  Scanner sc =new Scanner(System.in);
    public static void withdraw(int accountNo) {
        System.out.println(s+"Enter"+sufficient+"amount :");
        int amount = sc.nextInt();
        Customer user = Storage.mapClass.get(accountNo);

        if(amount > user.getBalance(user)){
            System.out.println("Insufficient balance");
            s="Please, ";
            sufficient = " sufficient ";
            amount = 0;
            withdraw(accountNo);
        }

        else {
            int currBalance = user.getBalance(user);
        currBalance-=amount;
        user.setBalance(user, currBalance);
        Customer updatedUser = Storage.mapClass.get(accountNo);
        System.out.println("Your current balance is : "+updatedUser.getBalance(updatedUser) );
        Continue.cont(accountNo);}

        
    }
}
