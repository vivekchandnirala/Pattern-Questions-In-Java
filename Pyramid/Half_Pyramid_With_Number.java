public class Half_Pyramid_With_Number {
    public static void main(String[] args) {

        //Print The Half Pyramid
        //Figure :

        // 1
        // 12
        // 123
        // 1234
        // 12345

        int m = 5;

        //for Outer  --> Row itne hai
        for (int i = 1; i <= m; i++) {

            //Yeh Column ke liye
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}