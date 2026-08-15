package Patterns;

public class flipped_Triangle {

    public static void main(String[] args) {
        int n=10;
        int a=n;

        for(int i=0; i<=n;i++){
            for(int j=0; j<=a;j++){


                System.out.print("*");
            }
            a--;
            System.out.println();
            
        }

        // second method 
             
//        int no=4;

        for(int i=0; i<=10;i++){ 

            for(int j=0;j<=n+1-i;j++){
              System.out.print(" *");
            }

            System.out.println();
        }
        
              int no=3;
        for(int i=0 ;i<=no; i++){

            for(int j=no; j>=i ;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    
}
