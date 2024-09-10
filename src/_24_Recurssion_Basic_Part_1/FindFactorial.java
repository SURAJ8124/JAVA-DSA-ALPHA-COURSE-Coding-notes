package _24_Recurssion_Basic_Part_1;

public class FindFactorial {
    public int factorialNumber(int n){
        if(n==0){
            return 1;
        }
        int fnm1=  factorialNumber(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static void main(String[] args){
      int n=5;
      FindFactorial object= new FindFactorial();
      System.out.println(object.factorialNumber(n));

    }
}
