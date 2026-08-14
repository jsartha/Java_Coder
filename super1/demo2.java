package super1;

public class demo2 {
    public static void main(String[] args) {
        
        student s1= new student();
        s1.age=21;
        s1.name="Sarthak";
        s1.school_department="Computer Science";
        s1.marks= 90;
        s1.display_School();
    }
    
}

class School{

    String name;
    int age;
    String school_department;
     int marks;
    void display_School(){
        System.out.println(name + "  "+ age + "  "+ school_department);
    }
}

class student extends School{

    void display_School(){

        super.display_School();

        System.out.println(" marks of student is "+ super.marks);
    }

      
}