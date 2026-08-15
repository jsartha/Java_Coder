package super1;

public class demo3 {
    public static void main(String[] args) {
 
        Engineerings e1= new Engineerings("Sarthak", 90, "Sangamner");
        
    }

    
}


class Student{
String name;
int marks ;
String address;


Student(String name , int marks , String address){
    
    this.name=name;
    this.marks=marks;
    this.address=address;
}
}


class Engineerings extends Student{

Engineerings(String name , int marks , String address){
    super(name,marks,address);
}
}

class Medical extends Student{
    Medical(String name , int marks , String address){
        super(name,marks,address);            
    }

}
