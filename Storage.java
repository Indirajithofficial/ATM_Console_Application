import java.util.*;
public class Storage {
    static HashMap<Integer,Integer> map =  new HashMap<>();
    static HashMap<Integer,Customer> mapClass =  new HashMap<>();

    public static void initiate(){
        
        Customer cust_1 = new Customer(12345, 12000, 2003, "Alok");
        Customer cust_2 = new Customer(12346, 1500, 2003, "Ryan");
        Customer cust_3 = new Customer(12347, 1000, 2004, "Hari");
        
        mapClass.put(12345,cust_1);
        mapClass.put(12346,cust_2);
        mapClass.put(12347,cust_3);
    }

    public static void storeInMap(int accountNo,int pin){
        map.put(accountNo,pin);
    }
    public static void storeAsObject(int accountNo,Customer prop){
        mapClass.put(accountNo,prop);
    }


}
