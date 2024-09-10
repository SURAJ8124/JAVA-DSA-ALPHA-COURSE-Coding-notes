package _24_Recurssion_Basic_Part_1;

public class LastOccurence {
    public int LastOccurence(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LastOccurence(arr,key,i+1);
        if(isFound==-1&& arr[i]==key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args){
       LastOccurence object= new LastOccurence();
       int arr[]={3,4,5,6,24,23,6,9,0};
       int key =6;
       int i=0;
      System.out.println(object.LastOccurence(arr,key,i)) ;

    }
}
