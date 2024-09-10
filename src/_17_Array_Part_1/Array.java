package _17_Array_Part_1;

public class Array {
    public static int linerSearch(int array[], int key){
        for(int i=0; i<array.length; i++) {
        if(array[i]==key){
            return i;
        }
        }
        return -1;
    }
    public static void main(String[] args){
        int array[]={67,89,1,4,5,6,90,78,};
        int key=90;
      System.out.println(linerSearch(array,key));

    }
}
