package _14Pattern_Part_1;

public class InvertedStarPattern {
    /*
    Q.2)Print the inverted star pattern
   ==> Algorithm:
      1) Total rows 4 (i=1; i<=4; i++)
      2)For Every Column  {System.out.println("*"+" ");}
          for i=1(" * * * * ") j==>4("*"+" ")
          for i=2(" * * *   ") j==>3("*"+" ")
          for i=3(" * *     ") j==>2("*"+" ")
          for i=1(" *       ") j==>1("*"+" ")
      3) For every row (int j=4; j>=i; j--);

      Output:
       j=4   " * * * * "  i=1
       j=3   " * * *   "  i=2
       j=2   " * *     "  i=3
       j=1   " *       "  i=4

     */

    public static void main(String[] args){
    for(int i=1; i<=4; i++){
        for(int j=4;j>=i;j--){
            System.out.print("+"+" ");
        }
        System.out.println();
    }
    }
}
