package Recurssion_Part_one;

public class PowerProblem {
  public  int power(int x, int n){
      if(n==0){
          return 1;
      }
      int xnm1= power(x,n-1);
      int xn= n*xnm1;
      return xn;
  }
    public static void main(String[] args){
        PowerProblem object= new PowerProblem();
        System.out.println(object.power(2,3));
        System.out.println(object.power(2,9));
        System.out.println(object.power(3,2));
        System.out.println(object.power(5,5));
    }
}
