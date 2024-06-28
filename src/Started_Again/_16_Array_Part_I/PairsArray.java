package _16_Array_Part_I;

public class PairsArray {
   public static void  PairsArray(int []array){
       for(int i=0; i<array.length; i++){
           for(int j=i+1; j<array.length;j++){
               System.out.print("("+array[i]+" "+ array[j]+")");
           }
           System.out.println();
       }
   }

    public static void main(String[] args){
        int []array={1,2,3,4,5,6,7};
        PairsArray(array);
    }
}
