import java.util.*;

public class Number_Pyramid {
    public static void main(String[] args) {

        //Print The Pattern
        //Figure:
/*
              1
             2 2
            3 3 3
           4 4 4 4
          5 5 5 5 5


*/
        int n=5;

        for (int i=1; i<=n; i++){

            //Printing The Number of Spaces

            for (int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            //Printing the Number ---> Which is Equal to Number of Rows
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
