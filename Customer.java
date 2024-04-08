
public class Customer {
    
    
    private int accountNo;
    private int balance;
    private int pin;
    private String name;
 
    Customer(int accountNo,int balance,int pin,String name){
        this.accountNo = accountNo;
        this.balance=balance;
        this.pin = pin;
        this.name = name;
        Storage.storeInMap(accountNo,pin);
        
    }

    

   //Getters....
    public int getAccountNo(Customer user){
        return user.accountNo;
    }
    public int getBalance(Customer user){
        return user.balance;
    }
    public int getPin(Customer user){
        return user.pin;
    }
    public String getName(Customer user){
        return user.name;
    }


    // Setters...
    public void setBalance(Customer user,int currBalance){
        user.balance = currBalance;
        Storage.mapClass.put(user.accountNo,user);
    }
    
    public void setPin(Customer user,int currPin){
        user.pin = currPin;
        Storage.mapClass.put(user.accountNo,user);
    }


   

}
