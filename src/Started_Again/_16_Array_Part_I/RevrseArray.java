package _16_Array_Part_I;

public class RevrseArray {

    public static void reverseArray(int [] array){
        int start=0;
        int end=array.length-1;
        while (start<end){
            int temp=array[end];
            array[end]=array[start];
            array[start]=temp;
            start++;
            end--;
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
    public static void main(String[] args){
        int []array={56,78,90,67,89};
        reverseArray(array);
    }
}
