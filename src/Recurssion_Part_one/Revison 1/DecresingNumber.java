public class DecresingNumber {

    public static void printNumber(int x){
        if(x==1){
        System.out.println(x);
        return;
     }
        System.out.println(x);
        printNumber(x-1);

     }
    public static void main(String[] args){
        System.out.println("Hello");
        printNumber(10);
    }
}
