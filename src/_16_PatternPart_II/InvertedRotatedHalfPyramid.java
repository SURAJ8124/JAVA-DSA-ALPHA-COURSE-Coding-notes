package _15_PatternPart_II;

public class InvertedRotatedHalfPyramid {
    public static void display(int n){
        for(int i=1;i<=n; i++){
            //Spaces
              for(int j=1; j<=n-i+1; j++){
                  System.out.print(" ");
              }
              for(int j=1; j<=i; j++){
                  System.out.print("*");
              }
            System.out.println();
          }

    }
    public static void main(String[] args){
        display(6);

    }
}
