package Array_Part_One_16;

public class SubArray {
    public static void printSubArray(int array[]){
        for(int i=0; i<array.length; i++){
            int start=i;
            for(int j=start; j<array.length;j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
      int subArray[]={34,56,67,90,23,12,45,56};
      printSubArray(subArray);
    }
}
