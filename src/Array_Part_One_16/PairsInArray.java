package Array_Part_One_16;

public class PairsInArray {
    public static void printPair(int array[]){
        for(int i=0; i<array.length;i++){
            for(int j=i+1; j<array.length; j++){
                System.out.println("("+array[i]+","+array[j]+")");
            }
        }
    }
    public static void main(String[] args){
        int array[] ={45,78,90,23,78,91};
        printPair(array);

    }
}
