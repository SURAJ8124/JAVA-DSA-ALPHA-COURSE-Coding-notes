package _15_FunctionsandMethods.Codes;

public class CallByValueAndRefrence {
   /*
   Call by value:
    in call by value, a copy of the actual argument is passed to the method.
    This means that changes made to the parameter inside the method do not affect on actual value.
    */
    static void callbyValue(int n){
        n=20;
        System.out.println("It is inside the method = "+n);
    }

    static void callbyRefernce(int[] array){
        array[0]=10;

    }

    public static void main(String[] args) {
        int n = 10;
        callbyValue(n);
        System.out.println("It is actual value =  " + n);
        int[] numbers = {1, 2, 3, 4, 5}; // Array to pass to the method
        System.out.println("Before call by reference");
        for( int num: numbers){
            System.out.print(num+",");
        }
        System.out.println();
        callbyRefernce(numbers);
         System.out.println("After call by reference");
        for( int num: numbers){
          System.out.print(num+",");
        }
    }
}
