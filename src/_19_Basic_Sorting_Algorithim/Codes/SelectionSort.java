package _19Basic_Sorting_Algorithim;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length;i++){
            int minimumPostion=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minimumPostion]>arr[j]){
                    minimumPostion=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minimumPostion];
            arr[minimumPostion]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static int[] selectionSortingAlog(int[] array){
      for(int i=0; i<array.length-2; i++){
          int minElement=i;
          for(int j=i+1; j<=array.length-1; j++){
               if(array[minElement]>array[j]){
                  minElement=j;
               }
          }
          int temp=array[minElement];
          array[minElement]=array[i];
          array[i]=temp;
      }

         return array;
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1,78,89,90};
          for(int num:selectionSortingAlog(arr)){
              System.out.print(num+",");
          }
//        selectionSort(arr);
    }
}
