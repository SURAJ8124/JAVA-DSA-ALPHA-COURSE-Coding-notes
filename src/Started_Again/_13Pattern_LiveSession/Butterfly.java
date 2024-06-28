package _13Pattern_LiveSession;

public class Butterfly {
    public static void main(String[] args){
        int n=8;
        for(int i=1; i<=n;i++){
                 for (int j = 1; j <= i; j++) {//Start Print
                     System.out.print("*");
                 }

                 for (int k = 1; k <= n - i * 2; k++) {//Spaces Printing
                     System.out.print(" ");
                 }

                 for (int j = 1; j <= i; j++) {//Start Print
                     System.out.print("*");
                 }
                 System.out.println();

        }
    }
}
