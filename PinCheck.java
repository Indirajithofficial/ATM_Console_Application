import java.util.*;
public class PinCheck {
    static  Scanner sc =new Scanner(System.in);

    public static void checkPin(int accountNo)
    {
       Customer user= Storage.mapClass.get(accountNo);
       System.out.println("Enter your pin number : ");
       int pin = sc.nextInt();
       

       while (pin != user.getPin(user)) {
        System.out.println("Please enter valid pin number : ");
        pin = sc.nextInt();
       }

        System.out.println("You have successfully login");
        Display.display(accountNo);
       
       


    }
    
}
