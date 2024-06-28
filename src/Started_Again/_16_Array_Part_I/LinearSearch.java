package _16_Array_Part_I;

public class LinearSearch {

    public static void linearSerch(int []array, int key){

        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                System.out.println("The key is "+key);
            }
        }

    }
    public static void main(String[] args){
       int array[]={10,20,30,40,50};
       int key =30;
       linearSerch(array, key);
    }
}
