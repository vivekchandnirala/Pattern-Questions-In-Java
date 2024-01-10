public class Triangle_0_and_1 {
    public static void main(String[] args){

        //Print 0 and 1 Triangle
        //Figure :

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        int n = 5; //Jitne bhi Row Hote hai utne Likh dete hai

        //1st For Hamesha Row ke liye hota hai phir uske andar COLUMN ke liye FOR use karte hai
        // Bahar Wale For KA Matlab hai ki wo kitne Row MEh Print Karega
        // Andar Wale ka Matlab hai ki usko kaise aur kis Pattern Meh Print Karega

        //Outer Loop
        for(int i = 1; i<=n; i++){

            //Inner Loop
            for (int j=1; j<=i;j++){
                //Is wale Question meh hum dekh sakte hai ki
                // Pattern Ban raha hai  Aur  Shirf 0  and 1 use ho raha hai
                // Jab bhi kuch aisa aaye tho matrix Ki tarah dekhna

                //Jaise Is meh dekhe tho row aur column ko plus kare aur
                //Even aaya tho 1 aur
                //Odd aaya tho 0
                //Aur ase meh If and Else use karege

                if((i+j)%2==0){ //To check It is Even
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
