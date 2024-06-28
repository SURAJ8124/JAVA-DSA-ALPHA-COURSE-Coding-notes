package _15_PatternPart_II;

public class FlodysTriangle {
    public static void display(int n){
       int  count=0;
        for(int i=1; i<=n; i++){
           for(int j=1; j<=i; j++){
               System.out.print(++count+" ");
           }
           System.out.println();
        }
    }
    public static void main(String[] args){
    display(6);

    }
}
