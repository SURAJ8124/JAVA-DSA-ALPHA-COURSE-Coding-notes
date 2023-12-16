//print the number of 7's that are in the 2d array

//Example:
//input - int[][] array={{4,7,8}{8,8,7}};
//output - 2

package Two_D_Array_live_session;

public class FirstProblem {
    int CountOfElement(int arr[][],int key){
        int count =0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        FirstProblem objectFrist=new FirstProblem();
        int[][] array={{4,7,8},{8,8,7},{6,2,7}};
       int valueOfCount= objectFrist.CountOfElement(array,7);
        System.out.println(valueOfCount);
    }
}
