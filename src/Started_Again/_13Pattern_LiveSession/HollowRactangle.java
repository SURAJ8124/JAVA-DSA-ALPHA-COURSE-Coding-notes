package _13Pattern_LiveSession;

public class HollowRactangle {
    public static void main(String[] args){
        int n=10;
        for(int i=1; i<=n; i++){
            if(i==1||i==n){
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=1; j<=n-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
