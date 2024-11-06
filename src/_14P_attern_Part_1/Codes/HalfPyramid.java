package _14Pattern_Part_1;

public class HalfPyramid {
    /*
    Output:
    " 1 "
    " 1 2 "
    " 1 2 3 "
    " 1 2 3 4 "
    Algo:
    1) Outer loop goes (int i=1; i<=4)
    2)For every row(int j=1; j<=i)
      {
       i=1,  j=1
       i=2,  j=1,2
       i=3,  j=1,2,3
       i=4,  j=1,2,3,4
      }
     3)Print(j)
     */

    public static void main(String[] args){
      for(int i=1; i<=4; i++){
          for(int j=1; j<=i; j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }
    }
}
