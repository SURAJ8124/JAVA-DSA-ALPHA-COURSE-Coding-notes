package _16_PatternPart_II.Codes;

public class InvertedRotetedHalfPyramidWithNumber {
    public static void PyramidWithNumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PyramidWithNumber(5);
    }
}
