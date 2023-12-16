package Array_Part_Two_16.Assignment;

import java.util.*;

/*
Questio:1
Given an integer array nums,return true if any value appears at least twice in the array,
 and return false if every element is distinct.
 Example 1:
 Input: nums = [1, 2, 3, 1]
 Output:  true

  Example 2:
 Input: nums = nums = [1, 2, 3, 4]
 Output:     false
 */
public class Question_One {


    public boolean containDupliccate(int array[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0; i<array.length;i++){
            if(set.contains(array[i])){
                return true;
            }
            else{
                set.add( array[i]);
            }
        }
        return false;
    }

    public boolean DistnictValue(int array[]){
        for(int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length;j++){
                if(array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean distnictValueSolutionSecond(int array[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<array.length;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        for (Integer value : map.values()) {
            if(value<=2) {
                return true;
            }
        }
        return false ;
    }


    public static void main(String[] args){
        int  nums[] = {1, 2, 3, 1};
        int nums2[]={34,45,56,6778,5,90,};
        Question_One solution=new Question_One();

       System.out.println(solution.distnictValueSolutionSecond(nums));

        boolean isValid=  solution.DistnictValue(nums);
        boolean isValidsecond=  solution.DistnictValue(nums2);
        System.out.println(solution.containDupliccate(nums));

        System.out.println(isValid);
        System.out.println(isValidsecond);

    }
}
