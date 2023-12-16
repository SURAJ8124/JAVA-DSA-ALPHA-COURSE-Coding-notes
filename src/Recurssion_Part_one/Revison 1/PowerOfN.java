public class PowerOfN {
    public static int powerOfElement(int x,int n){
        if(n==0){
            return 1;
        }
        int power=x*powerOfElement(x,n-1);
        return power;

    }
    public static void main(String[] args){
        int x=2;
        int n=5;
        System.out.println(powerOfElement(x,n));
    }
}
