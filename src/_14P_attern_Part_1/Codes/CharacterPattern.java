package _14Pattern_Part_1;

public class CharacterPattern {
    /*
    Output:
      "A"
      "B C"
      "D E F"
      "G H I J"
      Algorithm:
      char ch= "A"
       1)toatl rows 4 outer loop (int i=1 to n=4)
       2)Innear loop(j=1, j<=i)
         contain {
         i=1, j=A(1 element)
         i=2  j=B C(2 element)
         i=3  j=D E F(3 element)
         i=4  j=G H I J(4 Element)
         }
      3) Print(ch)

     */
    public static void main(String[] args){
        char ch='A';
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+"");
                ch++;
            }
            System.out.println();
        }
    }
}
