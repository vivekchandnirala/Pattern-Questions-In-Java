public class Solid_Rhombus {
    public static void main(String[] args) {

        //Print The Pattern
        //Figure:

        /*

                              *****
                             *****
                            *****
                           *****
                          *****

        Jab Ase pattern aa jaye aur samjh meh nah aaye tab usko matrix meh bana lena(boxes meh aur numbering kar lena)
        phir dekhna kaisa pattern ban raha hai

        jaise:- check karna Spaces meh kya relations hai
                Stars meh kya Relations hai

         */

        int n=5; //Number of Rows

        for(int i=1; i<=n; i++){
            //1st We will Print SPACES
            int sum = n-i;
            for(int j=1;j<=sum;j++){
                System.out.print(" ");
            }
            //2nd we Will Print STARS
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
