public class IncersingNumber {
    public static void incersingOrderNumber(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        incersingOrderNumber(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        incersingOrderNumber(10);

    }
}
