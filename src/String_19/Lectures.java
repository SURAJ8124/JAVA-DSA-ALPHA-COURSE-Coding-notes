package String_19;

import java.util.Scanner;

public class Lectures {
    public static void printLetters(String str){
     for(int i=0; i<str.length(); i++){
       System.out.println(str.charAt(i)+" ");
      }
    }
    public static void main(String[] args){
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2= new String("xyz");
        Scanner sc = new Scanner(System.in);
        String name;
//        name=sc.next();
        name=sc.nextLine();
        System.out.println(name);
        Lectures object1=new Lectures();
        object1.printLetters(str);

    }
}
