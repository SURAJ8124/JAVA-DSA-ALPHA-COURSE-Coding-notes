package String_19.Livesession;
//Q4:Check if2 String  are anagram

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

/*Two String are called anagram of each other if the frequency
of each character in both the string is same. Given two strings,
determine if they are anagram.
Examples:
1)s1="hello", s2="olleh"
Answer=true
 2)s1="AAAaaa", s2="AAaaaa"
 Answer=false;
 3)s1="aaaaabb" s2="AAAAABB"
 Answer=false;
 */
public class Problem_Four {
   public  boolean IsAngram(String str, String str2){
       int fristLength=str.length();
       int secondLength=str.length();
       if(fristLength!=secondLength){
           return false;
       };
       HashMap<Character, Integer>map=new HashMap<>();
       for(int i=0; i<fristLength; i++){
           Character firstValue=str.charAt(i);
           Character secondValue=str2.charAt(i);
           map.put(firstValue, map.getOrDefault(firstValue,0)+1);
           map.put(secondValue, map.getOrDefault(secondValue,0)-1);
       }
       for (Integer value : map.values()) {
            if(value!=0){
                return false;
            }
       }
       return true;
   }

   public boolean isAnagram_Second_Using_Array(String s1,String s2){
       if(s1.length()!=s2.length()){
           return false;
       }
           char s1char[]=s1.toCharArray();
           Arrays.sort(s1char);
           char s2char[]=s2.toCharArray();
           Arrays.sort(s2char);
           int flag=0;
           for(int i=0; i<s1char.length;i++){
               if(s1char[i]!=s2char[i]){
                   flag=1;
                       break;
               }
           }
           if(flag==0){
               return true;
           }
           else {
           return false;

           }
           }

           public boolean Solution_Three(String s1, String s2){
           if(s1.length()!=s2.length()){
               return false;
           }
           int frequency[]=new int[26];
           for(int i=0; i<s1.length(); i++){
           Character frist_char=s1.charAt(i);
           Character second_char=s2.charAt(i);
           frequency[frist_char-'a']++;
           frequency[second_char-'a']--;
           }
           for(int i=0; i<26; i++){
               if(frequency[i]!=0){
                   return false;
               }
           }
           return true;

           }

    public static void main (String[] args){
      Problem_Four object_first=new Problem_Four();
      String s1="olleh";
       String s2="hello";
      System.out.println(object_first.IsAngram(s1,s2));
        System.out.println(object_first.isAnagram_Second_Using_Array(s1,s2));
        System.out.println(object_first.Solution_Three(s1,s2));


    }
}
