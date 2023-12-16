package Recurssion_Part_one.LiveSessionPartone;

public class FirstProblem {
    public int sumOfElement(int n){
        int sum=0;
        if(n==1){
            return 1;
        }
        sumOfElement(n-1);
        sum=n+sumOfElement(n-1);
        return sum;
    }
    public static void main(String[] args){
        FirstProblem object= new FirstProblem();
        System.out.println(object.sumOfElement(5));
    }
}
