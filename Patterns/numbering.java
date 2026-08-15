package Patterns;

public class numbering {

    public static void main(String[] args) {
        
        for(int i=1;i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }



        for(int i=1; i<=5; i++){

            for(int j=1; j<=5; j++){

                System.out.print((char)(j+64 )+" ");
            }
            System.out.println();
        }



        for(int i=0;i<=10; i++){

            for(int j=0; j<=4; j++){
            
          System.out.print( (char)(j+97 ));

            }
            System.out.println();

        }
             // start pattern 

        for(int row=0; row<=5;row++){
            for(int col=0;col<=row;col++


            ){

                System.out.print((char) (col+97)+""
            );
            }
            System.out.println();
        }

        
        



    }
}

