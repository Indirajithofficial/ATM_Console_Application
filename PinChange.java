import java.util.*;
public class PinChange {
    static Scanner sc= new Scanner(System.in);
    static String pls="";
    static int newPin=0;
   
    public static void pinChange(int account){
        Customer user = Storage.mapClass.get(account);
        System.out.println(pls+"Enter your old pin :");;
        int pin1  =sc.nextInt();

        while(pin1 !=  user.getPin(user)){
            System.out.println("The entered pin is wrong.Please try again..");
            pin1 =sc.nextInt();
        }

        System.out.println("Enter your new pin :");
        int pin2 =sc.nextInt();

        while(pin2 ==user.getPin(user) ){
            System.out.println(pls+"Please enter a new pin : ");;
            pin2 =sc.nextInt();
        }
        
        user.setPin(user, pin2);
        System.out.println("Your pin has been changed successfully");
        PinCheck.checkPin(account);

        
    }
    
}
