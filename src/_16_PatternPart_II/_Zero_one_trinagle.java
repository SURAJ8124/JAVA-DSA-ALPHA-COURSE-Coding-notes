package _15_PatternPart_II;

public class _Zero_one_trinagle {
    public static void ZeroOneTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
               if((i+j)%2==0){
                   System.out.print("1");
               }
               else {
                   System.out.print("0");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ZeroOneTriangle(5);
    }
}
