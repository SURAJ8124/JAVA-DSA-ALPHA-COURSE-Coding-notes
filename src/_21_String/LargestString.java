package _21_String;
/*
Q3:
For a given set of Strings, Print the largest String.
"apple","mango","banana"
 */
public class LargestString {
    public static void main(String[] args){
        String fruits[]={"mango","banana","apple"};

        String largest=fruits[0];
        for(int i=1; i< fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
           largest=fruits[i];
            }
        }
        System.out.println(largest);

    }
}
