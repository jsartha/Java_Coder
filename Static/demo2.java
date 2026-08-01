package Static;

public class demo2 {
    public static void main(String[] args) {

        student s1= new  student( "Sarthak",101 ,293);
      //  student.college="AVCOE SANGAMNER";
        System.out.println(s1.name +" name" +s1.id +"id " + s1.roll_no +"roll no " + student.college);
        
        
    }
    
}


class student{

    String name;
    int id;
    int roll_no;
    static String college  ;//="AVCOE";


    student(String name , int id , int roll_no){
        
        this.id=id;
        this.name=name;
        this.roll_no=roll_no;


    }


    static{
        college="AVCOE SANGAMNER";
    }
}
