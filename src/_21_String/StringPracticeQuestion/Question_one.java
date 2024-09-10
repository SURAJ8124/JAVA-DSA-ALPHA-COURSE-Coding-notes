package _21_String.StringPracticeQuestion;
/*
Question: Count how many times lowercase vowels occurred in a string entered by the user
 */
public class Question_one {
    public int vowelsCount(String str){
        int count=0;
        for(int i=0; i<str.length(); i++) {
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] arfgs){
         Question_one solution= new Question_one();
         String str="abjhghjjkdiogbhjbybjbj";
         System.out.println(solution.vowelsCount(str));
    }
}
