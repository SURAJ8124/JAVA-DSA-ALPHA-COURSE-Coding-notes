package String_19.Livesession;
/*Q1: Count lower case vowels in a string
Given a String, count the number of lower case vowels charcters in the string
Example:
1)"hello world"
 Answer=3
2)"AEIOUaeiou"
 Answer=5
3)"aaaAAAub"
Answer=4*/
public class Problem_one {
    int countOflowerCaseVowels(String str){
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Problem_one object=new Problem_one();
        System.out.println(object.countOflowerCaseVowels("hello world"));
        System.out.println(object.countOflowerCaseVowels("AEIOUaeiou"));
        System.out.println(object.countOflowerCaseVowels("aaaAAAub"));


    }

}
