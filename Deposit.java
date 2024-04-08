import java.util.Scanner;

public class Deposit {
    static  Scanner sc =new Scanner(System.in);
    public static void deposit(int accountNo) {

        System.out.println("Enter the amount :");
        int amount = sc.nextInt();
        Customer user = Storage.mapClass.get(accountNo);
        int currBalance = user.getBalance(user);
        currBalance+=amount;
        user.setBalance(user, currBalance);
        Customer updatedUser = Storage.mapClass.get(accountNo);
        System.out.println("Your current balance is : "+updatedUser.getBalance(updatedUser) );
        Continue.cont(accountNo);

        
    }
}
