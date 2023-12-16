package Array_Part_One;

public class BinarySerch {
    public static int Binaryserch(int array[], int key){
        int start=0;
        int end=array.length-1;
        while (start<=end){
            int mid=(end+start)/2;
            if(array[mid]==key){
                return mid;
            } else if (array[mid]<key) {
               start= mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int array[]={12,23,34,45,56,67,78,79,90};
        int key =23;
      System.out.println( Binaryserch(array,key));
    }
}
