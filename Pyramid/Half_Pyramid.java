public class Half_Pyramid {
    public static void main(String[] args) {

        //Print The Half Pyramid
        //Figure :

        // *
        // **
        // ***
        // ****

        int m= 4;  // It Is Our ROW
        int n= m;  // Humne Column ko Row ke equal isliye liya hai kyuki
                    // JAB ROW 1 hai tab Column meh bhi 1 hi Star hai
                    //JAB ROW 2nd hai tab Column meh 2 Star hai
                    // Jab Row 3rd hai tab Column meh 3 Star hai
                    // Jab Row 4th hai tab Column meh 4 Star hai

        // Now We Will Use For Loop For to Create the Figure

        for(int i=1; i<=m; i++){ //IDHAR SE HAMARA ROW BAN JAYEGA

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
