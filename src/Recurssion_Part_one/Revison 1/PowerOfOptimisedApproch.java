public class PowerOfOptimisedApproch {
    public static int powerOfelement(int x, int n){
        if(n==0){
            return 1;
        }

      int half=  powerOfelement(x, n / 2);
        int halfSqure=half*half;

//        odd number
        if(n/2!=0) {
            int oddNumber = x*halfSqure*halfSqure;
            return oddNumber;
        }
        return halfSqure;

    }
    public static void main(String[] args){
        int x=2;
        int n=5;
        System.out.println(powerOfelement(x,n));
    }
}
