public class FirstOcurrence {
    public static int intergerOccurence(int array[],int key,int i){
        if(array[i]==key){
            return i;
        }
        if(i== array.length-1){
            return -1;
        }
       return  intergerOccurence(array,key,i+1);

    }
    public static void main(String[] args){
        int array[]={23,4,55,67,78};
        int i=0;
        int key=7;
        System.out.println(intergerOccurence(array,key,i));
    }
}
