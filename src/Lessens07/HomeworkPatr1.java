package Lessens07;

import java.util.Scanner;

public class HomeworkPatr1 {

    public static void main(String[] args) {

        //Supermarket item finder:
        Scanner inputItems = new Scanner(System.in);
        System.out.println("Pleas input item:");
        String items = inputItems.nextLine().toLowerCase();
        switch (items){
            case "diapers":
                System.out.println(items + " - Aisle 1");
                break;
            case "apple":
            case "orange":
                System.out.println(items + " - Aisle 2");
                break;
            case "candy":
                System.out.println(items + " - Aisle 3");
                break;
            case "french Fries":
            case "frozen Pizza":
                System.out.println(items + " - Aisle 7");
                break;
            case  "milk":
            case "eggs":
            case "donuts":
                System.out.println(items + " - Aisle 8");
                break;
                default:
                    System.out.println("Out of stock");
        }
        System.out.println("Thank you to chose our Supermarket");
    }
}
