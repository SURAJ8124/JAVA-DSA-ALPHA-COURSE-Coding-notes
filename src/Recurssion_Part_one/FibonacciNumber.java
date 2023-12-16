package Recurssion_Part_one;

public class FibonacciNumber {
    public int fibonacciNumber(int n){
        if(n==0||n==1){
            return n;
        }
        int fibnm1=fibonacciNumber(n-1);
       int fibnm2= fibonacciNumber(n-2);
       int fib=fibnm1+fibnm2;
       return fib;
    }
    public static void main(String[] args){
      FibonacciNumber object= new FibonacciNumber();
      System.out.println(object.fibonacciNumber(8));
    }
}
