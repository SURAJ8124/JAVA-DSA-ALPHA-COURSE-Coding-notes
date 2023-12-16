package Array_Part_One;

public class ReverseArray {
    public static void reverseArrays(int array[]){
        int start=0;
        int end=array.length-1;
        while (start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String args[]){
      int array[]={45,46,90,98,};
       reverseArrays(array) ;
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
