package _15_FunctionsandMethods.Codes;

public class FactorialNumber {
    public static int factorial(int fact){
        int factorialNumber=1;
        for(int i=1; i<=fact;i++){
            factorialNumber=factorialNumber*i;
        }
        return factorialNumber;
    }
    public static void main(String[] args){
        System.out.println(factorial(2));
        System.out.println(factorial(5));

    }
}
