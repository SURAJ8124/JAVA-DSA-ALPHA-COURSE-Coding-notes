package _21_String.StringPracticeQuestion;

import java.util.HashMap;

/*
Question 4 :Determine if 2 Strings areanagramsof each other.
What are anagrams?
If two strings contain the same characters but in a different order,
they can be said to be anagrams.Consider race and care.
In this case,race's characters can be formed in to a study,or care's
characters can be formed into race.Below is a java program to check if two strings are
 anagrams or not.
 */
public class Question_Four {
    public boolean isAngram(String str,String str2){
        int first_length=str.length();
        int second_length=str2.length();
        if(first_length!=second_length){
            return false;
        }
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0; i<first_length;i++){
            Character firstCharacter=str.charAt(i);
            Character secondCharcater=str2.charAt(i);
            map.put(firstCharacter,map.getOrDefault(firstCharacter,0)+1);
            map.put(secondCharcater,map.getOrDefault(secondCharcater,0)-1);
        }
        for(int values:map.values()){
            if(values!=0){
                return false;
            }
        }
        return true;
    }
    public  static void main(String[] args){
     Question_Four solution_Angram=new Question_Four();
     String str="anagram";
     String str2="naagram";
     System.out.println( solution_Angram.isAngram(str,str2));

    }
}
