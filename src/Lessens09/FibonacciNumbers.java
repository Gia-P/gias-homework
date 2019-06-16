package Lessens09;

public class FibonacciNumbers {

    private static void fibonacciNumbers (int number){

        int fbNumbers1 = 0;
        int fbNumbers2 = 1 ;

        for (int i = 0; i < number; i++){
            System.out.print(fbNumbers1 + " + " );
            int sum = fbNumbers1 + fbNumbers2;
            fbNumbers1 = fbNumbers2;
            fbNumbers2 = sum;
        }
    }

    public static void main(String[] args) {

        fibonacciNumbers(5);
    }
}
