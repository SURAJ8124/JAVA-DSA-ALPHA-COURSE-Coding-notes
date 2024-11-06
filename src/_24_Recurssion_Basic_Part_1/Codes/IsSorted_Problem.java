package _24_Recurssion_Basic_Part_1;
/*
Check if given array is Sorted or not
[1,2,3,4,5,6]
 */
public class IsSorted_Problem {
    public boolean isSorted(int arrr[],int i){
        if(i==arrr.length-1){
            return true;
        }
       else if(arrr[i]>arrr[i+1]){
           return false;
        }
     return  isSorted(arrr,i+1);

    }
    public static void main(String[] args){
    IsSorted_Problem object= new IsSorted_Problem();
    int arr[]={3,4,5,6,7,8,9,10};
    int i=0;
    System.out.println(object.isSorted(arr, i));
    }
}
