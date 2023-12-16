package Array_Part_Two_16;

public class MaximumSubArrayWithPrefixApproch {
    public static  int maximumSubArray(int array[]){
        int currentsum=0;
        int maximuSum=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        for(int i=1; i<array.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        for(int i=0; i<array.length;i++){
            int start=i;
            for(int j=i; j<array.length; j++){
                int end =j;
                currentsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maximuSum<currentsum){
                    maximuSum=currentsum;
                }
            }

        }
        return maximuSum;
    }
    public static void main(String[] args){
        int array[]={1,2,3,4,5,6};
        int sum=maximumSubArray(array);
        System.out.println(sum);
    }
}
