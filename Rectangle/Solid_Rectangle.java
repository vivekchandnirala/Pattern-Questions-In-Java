import java.util.*;

public class Solid_Rectangle {
    public static void main(String[] args) {

        //Print The Solid Rectangle
        //Figure :

        // *****
        // *****
        // *****
        // *****


        //We consider row as i and i=4
        //We consider coloumn as j and j=5

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
