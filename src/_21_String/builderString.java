package _21_String;
import java.lang.StringBuilder;
public class builderString {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
