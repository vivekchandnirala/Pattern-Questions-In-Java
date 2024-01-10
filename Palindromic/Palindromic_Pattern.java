public class Palindromic_Pattern {
    public static void main(String[] args) {

        //Print The Pattern
        //Figure:
/*
               1
             2 1 2
           3 2 1 2 3
         4 3 2 1 2 3 4
       5 4 3 2 1 2 3 4 5

We Define this pattern in 3 parts
1st We Print Spaces
2nd We Print The Number in DECREMENT way and we use FOR loop and Move From i to 1
3rd We Print The Number in INCREMENT way and we use FOR loop and Move From 2 to i
*/

        int n = 5; //Yeh tho Number of Rows ke liye Likhte hai ki Kitne hai Rows

        for (int i = 1; i<=n; i++){// Yeh tho Rows ke liye ho gaya

            //Printing The Spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Printing The 1st Number Where it is decreasing from (Number of Rows To 1)
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }

            //Printing The 2nd Number Where it is increasing from ( 2 to Number of Rows(i) )
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}