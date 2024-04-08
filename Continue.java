import java.util.*;

public class Continue {
    static  Scanner sc =new Scanner(System.in);

     public static void cont(int accountNo){
        System.out.println("Do you want to continue y/n");
        char c = sc.next().charAt(0);
        if(c == 'y'){
            Display.display(accountNo);
        }
        else{
            System.out.println("    Thanks for coming....");
        }
    }
}
