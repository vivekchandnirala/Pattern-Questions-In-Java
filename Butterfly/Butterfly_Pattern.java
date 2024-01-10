public class Butterfly_Pattern {
    public static void main(String[] args){

        //Print The Pattern
        //Figure:

/*

             *      *
             **    **
             ***  ***
             ********
             ********
             ***  ***
             **    **
             *      *

If we see Properly Then We can Divite it into 2 parts, Becasue The LOWER part is Totally Inverse of the Top part

        So we Firstly tackle with 1st Part which is Upper Part

        If we see more Clearly Then, we divide  Upper Part Into 3 subpart
        1st Star Part where is only 1Star
        2nd Spaces
        3rd Stars

        Stars Are equal to Number of Rows

        Always Find Some Pattern Then Start the Solving

*/

        int n= 4;  // We considering Only 4 Rows Because @nd Part is Invert of the Top Part

        //UPPAR PART
        for (int i=1; i<=n ; i++){

            //1st Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2nd Spaces
            // Find the pattern How Spaces are design then solve it
            int s= 2*(n-i);
            for (int j=1; j<=s;j++) {
                System.out.print(" ");
            }
            //3rd Stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Part
        //We Just Copy and Paste it and some Changement
        //Like in Upper Part we are going from 1 to n in Stars and rows Now we go From N to 1

        //Inverting
        for (int i=n; i>=1 ; i--){

            //1st Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2nd Spaces
            // Find the pattern How Spaces are design then solve it
            int s= 2*(n-i);
            for (int j=1; j<=s;j++) {
                System.out.print(" ");
            }
            //3rd Stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
