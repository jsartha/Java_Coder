package super1;

public class demo {
    
    public static void main(String[] args) {
       
        student1 s1= new student1();
        s1.age=21;
        s1.name="Sarthak";
        s1.college_department="Computer Science";
        s1.display_info();

    }

}


class college{

   String  name;

   int age ;
  String college_department;

}

class student1 extends college{

    

    void display_info(){

        
        System.out.println(super.name + "  "+ super.age + "  "+ super.college_department);
    }
}
