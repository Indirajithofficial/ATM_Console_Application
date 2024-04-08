public class BalanceCeck {
 
    public static void balanceCheck(int accountNo){
        Customer user = Storage.mapClass.get(accountNo);
        int balance = user.getBalance(user);
        System.out.println("Your current balance is : "+balance);
        Continue.cont(accountNo);
    }
}
