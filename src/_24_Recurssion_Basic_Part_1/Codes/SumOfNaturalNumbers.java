package _24_Recurssion_Basic_Part_1;

public class SumOfNaturalNumbers {
    public int sumOfNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        sumOfNaturalNumber(n-1);
        int sum=n+sumOfNaturalNumber(n-1);
        return sum;
    }
    public static void main(String[] args){
     SumOfNaturalNumbers object= new SumOfNaturalNumbers();
      System.out.println(object.sumOfNaturalNumber(5));
    }
}
