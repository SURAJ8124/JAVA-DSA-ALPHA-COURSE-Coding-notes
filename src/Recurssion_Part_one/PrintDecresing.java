package Recurssion_Part_one;

public class PrintDecresing {
    public void printDecresingNumber(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecresingNumber(n-1);
    }

    public void printIncresing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncresing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        PrintDecresing obj=new PrintDecresing();
        int n=9;
        obj.printDecresingNumber(n);
        obj.printIncresing(n);

    }
}
