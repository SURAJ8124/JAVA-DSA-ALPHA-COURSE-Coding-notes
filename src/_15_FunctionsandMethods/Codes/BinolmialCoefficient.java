package _15_FunctionsandMethods.Codes;

public class BinolmialCoefficient {
//    1)nCr=N!/r!(n-r)!
    public static void main(String[] args){
      FactorialNumber obj= new FactorialNumber();
       int n=4;
       int r=2;
      int n_Fact= obj.factorial(n);
      int r_fact=obj.factorial(r);
      int nmr_fact=obj.factorial(n-r);
      int binomialCoefficient=n_Fact/r_fact*nmr_fact;
      System.out.println(binomialCoefficient);
    }
}
