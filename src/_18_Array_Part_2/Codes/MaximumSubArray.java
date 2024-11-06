package _18Array_Part_2;

public class MaximumSubArray {
    public static int MaximumSubArray(int array[]){
        int current =0;
        int maximumSum=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            for(int j=i;j<array.length;j++){
                for(int k=i; k<=j; k++){
                    current+=array[k];
                }
              if(maximumSum<current){
                  maximumSum=current;
              }
            }

        }
        return maximumSum;

    }
    public static void main(String[] args){
        int array[]={1,2,3,4,5,6,7,8,9};
       int answer= MaximumSubArray(array);
        System.out.println(answer);
    }
}
