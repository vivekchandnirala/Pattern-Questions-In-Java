public class Hollow_Rectangle {
    public static void main(String[] args) {

        //Print The Hollow Rectangle
        //Figure :

        // *****
        // *   *
        // *   *
        // *****

        int m=4; // This is for Row
        int n=5; // This is for Column

        //Now Using For Loop to design the Figure

        for(int i=1;i<=m;i++){ // Tell About The Row

            for(int j=1;j<=n;j++){ // Tell About The Column
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
