package Array_Part_Two_17;

public class MaximumSubArrayKadansAlgorithm {
    public static int kadaneslAlgorithm(int array[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<array.length; i++){
            cs+=array[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        return ms;
    }
    public static void main(String[] argss){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        int sum=kadaneslAlgorithm(array);
        System.out.println(sum);
    }
}
