public class DuplicateString {
    public static String removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentCharacter= str.charAt(index);
         if(map[currentCharacter-'a']==true){
             removeDuplicate(str,index+1,newStr,map);
         }
         else {
             map[currentCharacter-'a']=true;
             removeDuplicate(str,index+1, newStr.append(currentCharacter),map);
         }
    }
    public static void main(String[] args){
        String str= "appnnacollege";
        int index=0;
        StringBuilder newStr= new StringBuilder("");
        boolean map[]=new boolean[26];
        System.out.println();removeDuplicate(str,index, newStr,map);

    }
}
