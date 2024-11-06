package _15_FunctionsandMethods.Codes;

public class BinaryTodecimal {

    public static int deCimal(int binNum){
        //1)Divide binary number by 10 and get last digit of it
        int pow=0;
        int decimal=0;
        while(binNum>0) {
            int lastDigit = binNum % 10;
            //2) Take a last digit and calculate their decimal
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        return decimal;

    }
    public static void main(String[] args){
       System.out.print(deCimal(101));
    }
}
