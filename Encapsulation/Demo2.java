package Encapsulation;

public class Demo2 {
    
public static void main(String[] args) {

  information info= new information("sarthak" , 21 , 123458960954l);

  System.out.println("Name is : "+info.getName());
  System.out.println("Age is : "+info.getAge());
  System.out.println("Account is : "+info.getAccount());


  // Set  name 
  info.setName("joshi sir");
  System.out.println("Name is : "+info.getName());

  info.setAge(22);
  System.out.println("Age is : "+info.getAge());
}
}


class information{

 private   String name;
  private  int age ;
  private  long Account;


   
  

 information ( String name , int age , long Account ){

    this.Account=Account;
    this.age=age;
    this.name=name;

 }
  // Gettr method

  public String getName(){
    return name;
  }

  // set name

  public void setName(String name){

    this.name=name;
  }

  public int  getAge(){

    return age;
  }

  public void setAge(int age){

    this.age=age;
  }


  public long getAccount(){

    return Account;
  }
  public  void setAccount(long Account){

    this.Account=Account;
  }
}

