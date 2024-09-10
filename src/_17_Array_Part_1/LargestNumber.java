package _17_Array_Part_1;

public class LargestNumber {
    public static int getLargest(int numbers[] ){
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args){
        int numbers[]={1,2,3,45,6,};
        System.out.println("Largest Number is:"+getLargest(numbers));

    }
}
