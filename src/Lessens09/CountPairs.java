package Lessens09;

public class CountPairs {

    public static void countPairsSum() {

        int arr[] = {1, 5, 7, -1, 5, 4};
        int n = 0;
        int sum = 12;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                int arrsum = arr[i] +arr[j];
                if (arrsum == sum) {
                    System.out.print("Pairs with sum " + sum + " are (" + arr[i] + ", " + arr[j] + ") ");
                    n++;
                    break;
                }
            }
        }
        System.out.println("Count is: " +n + " times ");
    }



    public static void main(String[] args) {

        countPairsSum();
    }
}
