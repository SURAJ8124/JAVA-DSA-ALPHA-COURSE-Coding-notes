public class SumOFNaturalNumber {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sumOfNumber= n+sum(n-1);
        return sumOfNumber;
    }
    public static void main(String[] args){
        System.out.println(sum(3));
    }

}
