class Example{

    public static void main (String [] args) {
         
    Student S1= new Student("sarthak" , 101 ,11);

    System.out.println(S1.name);
    //System.out.println(Student.college);
    System.out.println(S1.id);
    System.out.println(S1.roll_no);


    }
}


class Student {


    String name;
    int id;
    int roll_no;
      
     

       String Attendence(String atten){
       System.out.println(atten+" your attendence are  low in "+ name);
    
             return atten;
    }

    Student( String name , int id , int roll_no ){
      

        this.name=name;
        this.id=id;
        this.roll_no=roll_no;
     //   this.college=college;


    }
}