package _Basic_Sorting_Algorithim_18;

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

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1,78,89,90};
        selectionSort(arr);
    }
}
