package _17_Array_Part_1;
public class LinearSearch{
public static int linearSearch(int array[], int key){
    for(int i=0; i<array.length; i++){
        if(array[i]==key){
            return i;
        }
    }
    return -1;
}
public static void main(String[] args){
    int array[]={90,56,78,34,67,65,};
    System.out.println(linearSearch(array, 67));
};
                                                                    };
