public class Diamond_Pattern {
    public static void main(String[] args) {

        //Print The Pattern
        //Figure:
/*
               *
             * * *
           * * * * *
         * * * * * * *
         * * * * * * *
           * * * * *
             * * *
               *


 */
        int n =4;

        for(int i=1; i<=n; i++){

            //Printing The Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Printing The Stars
            int s= 2*i-1;
            for(int j=1;j<=s;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Just Inverting The above Code
        //Previously we are going to 1 to n
        //Now we go from n to 1

        for(int i=n; i>=1; i--){

            //Printing The Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Printing The Stars
            int s= 2*i-1;
            for(int j=1;j<=s;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
