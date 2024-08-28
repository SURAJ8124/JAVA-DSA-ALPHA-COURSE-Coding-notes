package _Basic_Sorting_Algorithim_18;
 /*
     What is Sorting ?
 --> 1)A sorting algorithm is a method used to rearrange a list of elements in a specific order,
     usually in ascending or descending order. Examples of sorting algorithms include
     Quick Sort, Merge Sort, Bubble Sort, and Insertion Sort.


     */

public class BubbleSort {
    /*
    Bubble Sort:
       Bubble Sort is a simple sorting algorithm that repeatedly compares and swaps adjacent elements.
       [5,4,3,2,1]
       Algorithm:
        1)  [4,5,3,2,1]
        2) [3,4,5,2,1]
         3) [2,3,4,5,1]
         4) [1,2,3,4,5]
         Time Complexcity : O(n^2)

     */
    public static void bubbleSort(int arr[]) {
        for (int outerLoop = 0; outerLoop < arr.length - 1; outerLoop++) {
            for (int innner = 0; innner < arr.length - 1; innner++) {
                if (arr[innner] < arr[innner + 1]) {
                    int temp = arr[innner];
                    arr[innner] = arr[innner + 1];
                    arr[innner + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1,78,89,90};
        bubbleSort(arr);
        System.out.println("Hello");
    }
}
