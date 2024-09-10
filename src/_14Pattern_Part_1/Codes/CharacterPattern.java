package _14Pattern_Part_1;

public class CharacterPattern {
    public static void main(String[] args){
        char ch= 'A';
        for(int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
