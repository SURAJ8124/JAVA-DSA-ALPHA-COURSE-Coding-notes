package _15_PatternPart_II;

public class HollowReactangle {
    public static void main(String[] args){
        int totalRows=6;
        int totalColumns=5;
        for(int i=1; i<=totalRows; i++) {
            for (int j = 1; j <= totalColumns; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalColumns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
