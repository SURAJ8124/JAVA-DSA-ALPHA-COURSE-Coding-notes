package _16_Array_Part_I;

public class LargestInArray {
    public static void largest (int []array){
        int largestElemet=0;
        for( int i=0; i< array.length; i++){
            if(largestElemet<array[i]){
                largestElemet=array[i];
            }
        }
        System.out.println("Largest element is equal to "+ largestElemet);

    }
    public static void main(String[] args){
        int array[]={10,20,30,40,50};
        largest(array);
    }
}
