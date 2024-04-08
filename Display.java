import java.util.*;

public class Display {
    static  Scanner sc =new Scanner(System.in);
    public static void display(int accountNo){

        System.out.println("Click the number to continue operation : ");
        System.out.println("1.Deposit\n2.Withdrawal\n3.Balance Check\n4.Pin Change\n5.Exit");
        int num = sc.nextInt();

       
    
        switch(num){
            case 1:
              Deposit.deposit(accountNo);
              break;
            case 2:
              Withdraw.withdraw(accountNo);
              break;
            case 3:
              BalanceCeck.balanceCheck(accountNo);
              break;
            case 4:
             PinChange.pinChange(accountNo);
              break;
            case 5 :
              System.out.println("Thank you..");
              return;
            
        }
    }
}
