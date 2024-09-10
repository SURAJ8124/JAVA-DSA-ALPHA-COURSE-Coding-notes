package _17_Array_Part_1;

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
    public static void binarySearch(int array[] ,int key){
        int start =0;
        int end=array.length-1;
        while (start<=end){
            int mid= (start+end)/2;
            if(array[mid]==key){
                System.out.println("Got the element"+ key);
            }
            if (array[mid]<key){
                start= mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
    public static void main(String[] args){
        int array[]={12,23,34,45,56,67,78,79,90};
        int key =23;
      System.out.println( Binaryserch(array,key));

        int numbers[]={2,4,6,8,10,12};
        int element= 10;
         binarySearch(numbers,element );
    }
}
