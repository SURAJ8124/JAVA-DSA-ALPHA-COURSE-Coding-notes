package _17_Array_Part_1;



public class LargestNumber {
    public static int largestNumber(int array[]){
        int largestNumber= Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>largestNumber){
                largestNumber=array[i];
            }
        }
      return largestNumber;
    }
    public static void main(String[] args){
        int array[]={90,56,78,34,67,65,100};
        System.out.println(largestNumber(array));
    }
}