package _16_Array_Part_I;

public class BinarySerchg {
    public static void binarySearch(int []array ,int key){
        int start =0;
        int end=array.length-1;
        while (start<end){
            int mid= start+end/2;
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
        int array[]={2,4,6,8,10,12,14};
        int key= 10;
        binarySearch(array,key);
    }
}
