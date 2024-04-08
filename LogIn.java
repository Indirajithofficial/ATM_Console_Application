import java.util.*;
public class LogIn {
    
    static  Scanner sc =new Scanner(System.in);

    public static void logIn(){
        System.out.println("Enter your account no : ");
        int account = sc.nextInt();
        if( Storage.map.containsKey(account) ){
           PinCheck.checkPin(account);
        }
        else{
              System.out.println("### Account number does not exist ###");
        }

    }

    public static void loginWithNewPin(){
        
    }
    
}
