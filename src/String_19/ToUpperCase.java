package String_19;
import java.lang.StringBuilder;
public class ToUpperCase {
    public String toUppercase(String str){
        char ch= Character.toUpperCase(str.charAt(0));
        StringBuilder object= new StringBuilder("");
        object.append(ch);
        for(int i=1; i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()){
                object.append(str.charAt(i));
                i++;
                object.append(Character.toUpperCase(str.charAt(i)));
            }else {
                object.append(str.charAt(i));
            }
        }
        return object.toString();
    }
    public static void main(String[] args){
        String str="hi,my name is suraj";
     ToUpperCase obj= new ToUpperCase();
     System.out.println(obj.toUppercase(str));
    }
}
