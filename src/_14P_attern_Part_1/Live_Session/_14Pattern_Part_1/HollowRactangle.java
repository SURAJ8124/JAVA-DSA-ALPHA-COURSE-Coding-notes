package LiveSession._14Pattern_Part_1;

public class HollowRactangle {

    /*
      Question:
         "Hollow Ractangle pattern"
         {"      *****       "}
         {"      *   *       "}
         {"      *   *       "}
         {"      *****       "}

     Algo:
       1) for outer loop(int i=1; i<=4)
       2)for inner loop(int i=1; i<=5)
          if(j||i=1 && j||i=4)
           (a)first row is contain 5 star with Zero space  and last also "print("*)"
         else-(b)except this each row contains
               (I) one star at first position and three space and then one star
                    {" "}

     */
    public static void main(String[] args){
        for(int i=1; i<=4;i++){
            for(int j=1; j<=5; j++){
                if(i==1||j==1||i==4||j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
