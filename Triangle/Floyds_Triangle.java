import java.util.*;
public class Floyds_Triangle {
    public static void main(String[] args) {

        //Print The Half Pyramid
        //Figure :

        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15

        int n=5;
        //This Is for Number of Rows

        int Num=1;
        //Isko isliye liya hai kyuki hume print badhte hue karam meh karna hai
        // agar hume next line 1 se start karna hota tho yeh nahi lete

        //for Loop Using;

        //Outer loop
        for(int i=1; i<=n;i++){
            //Inner Loop
            for(int j=1;j<=i;j++){
                System.out.print(Num +" ");
                Num++;
            }

            System.out.println();
        }
    }
}