public class Rotated_180_Inverted_Half_Pyramid {
    public static void main(String[] args) {

        //Print The Rotated 180 Inverted Half Pyramid
        //Figure :

        //    *
        //   **
        //  ***
        // ****

        int m=4;

        //outer Loop
        for (int i=1;i<=m;i++){

            //Inner Loop for Spaces
            for (int j = 1; j<=m-i; j++){
                System.out.print(" ");
            }
            //Inner Loop for Stars
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
