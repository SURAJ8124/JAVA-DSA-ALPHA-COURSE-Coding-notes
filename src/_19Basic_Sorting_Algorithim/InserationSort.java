package _19Basic_Sorting_Algorithim;

public class InserationSort {
    public static void inserationSort(int arr[]){

        /*
        Insertion sort is a simple and efficient sorting algorithm that
         builds a sorted array one element at a time by repeatedly picking
         the next element and inserting it into its correct position among
         the already sorted elements. It works well for small or nearly sorted
         datasets and has an average and worst-case time complexity of
         Time Complexicity: O(n^2)
         */
        for(int i=1; i<arr.length;i++){
            int curr=arr[i];
            int previous=i-1;
            while(previous>=0&&arr[previous]>curr){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=curr;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1,78,89,90};
        inserationSort(arr);
        System.out.println("Hello");
    }
}
