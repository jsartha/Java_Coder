package Encapsulation;

public class demo {
    public static  void main(String [] args){

        Bank b1 = new Bank();

        b1.deposite(1000);
        b1.Withdraw(5000);
        System.out.println(" your balance are avilable "+ b1.getBalance());
    }
}

class Bank{

   private int balance;

   public void deposite(int amount){
    balance +=amount;
   }
  
   public void  Withdraw( int amount ){
        balance -= amount;
   }

  public  int getBalance(){

    return balance;
  }

}
