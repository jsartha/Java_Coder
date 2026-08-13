package Patterns;

import java.util.Scanner;
class First {

    public static void main(String args []){

        for(  int i=1 ; i<=3 ; i++){
          
            for(int j=1 ; j<=5 ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
   
        
        Scanner sc= new Scanner (System.in);

        
        System.out.println(" enter the number of row");
        int row=sc.nextInt();
       System.out.println(" enter the number of col");
        int col=sc.nextInt();

       for(int i=1 ; i<=row;i++){

        for(int j=1 ; j<=col;j++){

            System.out.print("* ");
        }
        System.out.println(" ");
       }
}
}