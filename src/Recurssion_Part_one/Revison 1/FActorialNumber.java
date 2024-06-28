public class FActorialNumber {
    public static int factorialFun(int n){
        if(n==1){
            return 1;
        }
        int factorial=n*factorialFun(n-1);
        return factorial;

    }
    public static void main(String[] args){
     System.out.println(factorialFun(4));
     System.out.println(factorialFun(6));

    }
}
