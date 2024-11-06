package _15_FunctionsandMethods.Codes;

public class PrimeNumber {
    public static boolean isPrime(int n){
         for(int i=2;i<=n-1;i++){
             if(n%i==0){
                 return true;
             }
         }
         return false;
    }
    public static void main(String[] args){
       System.out.print( isPrime(11));
    }
}
