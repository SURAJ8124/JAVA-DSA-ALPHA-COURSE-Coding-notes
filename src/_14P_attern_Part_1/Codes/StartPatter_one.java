package _14Pattern_Part_1;

public class StartPatter_one {
    /*
    Question: Print Star Pattern Using nested loop
    Algorithm:
    For Outer loop(int i=0; i<=4;i++)
        1)Total Rows 5 so Outer loop is till the n-1 that is 4
        For inner loop (int j=0; j<=i; j++)
        2) in the every row each star increasing by one
         and it contains one space after every iteration
         System.out.println("*"+" ");
        1) For i=1;
            ==> j<=1  Print: "* "
        2) For i=2;
        ==>j<=2    Print:   "* * "
        3) For i=3;
        ==>j<=3    Print:   "* * * "
        4) For i=4;
        ==>j<=4    Print:   "* * * * "

    Output:
           *         i,j==1
           * *        i,j=2
           * * *       i,j=3
           * * * *      i,j=4
     */
    public static void main(String[] args){
        for(int i=1; i<=4;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
