public class Inverted_Half_Pyramid {
    public static void main(String[] args){

        //Print The Inverted Half Pyramid
        //Figure :

        // ****
        // ***
        // **
        // *

        int m= 4;


        for(int i=1;i<=m;i++){

            for(int j=m;i<=j;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
