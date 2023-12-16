public class FibonaciSeries {
    public static int fibonacciNumber(int n){
        if (n==1||n==0){
            return n;
        }
        int fibonumber=fibonacciNumber(n-1)+fibonacciNumber(n-2);
        return fibonumber;

    }
    public static void main(String[] args){
        System.out.println(fibonacciNumber(5));
    }
}
