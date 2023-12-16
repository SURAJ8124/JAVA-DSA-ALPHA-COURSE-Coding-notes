public class LAstOccurance {
    public static int lastOccurance(int array[],int key, int lengthOfarray){
        if(array[lengthOfarray]==key){
            return lengthOfarray;
        }
        if(lengthOfarray==0&& array[lengthOfarray]!=key){
            return -1;
        }
        return lastOccurance(array,key,lengthOfarray-1);
    }
    public static void main(String[] args){
        int array[]={1,2,3,4,4,5,6,6,78,90};
        int length=array.length-1;
        int key=7;
       System.out.println( lastOccurance(array,key,length));
    }
}
