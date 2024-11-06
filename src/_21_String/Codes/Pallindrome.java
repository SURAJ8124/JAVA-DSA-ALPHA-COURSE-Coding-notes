package _21_String;

public class Pallindrome {
    public boolean isPallindrome(String str){
       for(int i=0; i<str.length()/2; i++) {
           int n=str.length();
           if(str.charAt(i)!=str.charAt(n-1-i)) {
            return false;
           }
         }
       return true;
    }
    public static void main(String[] args){
        String str="racecar";
        String str2= "noon";
        String str3="Brand";
        Pallindrome objec1= new Pallindrome();
       System.out.print(objec1.isPallindrome(str)) ;
        System.out.print(objec1.isPallindrome(str2)) ;
        System.out.print(objec1.isPallindrome(str3)) ;


    }
}
