package Lessens07;

import java.util.Scanner;

public class HomeworkPart2 {

    public static void main(String[] args) {

        //Student Score
        Scanner inputScor = new Scanner(System.in);
        Scanner inputMaxScor = new Scanner(System.in);
        System.out.println("Pleas insert Maximum score:");
        int maxScore = inputMaxScor.nextInt();
        System.out.println("Maximum score is: " + maxScore + " pleas insert score 0 - " + maxScore);
        double score = inputScor.nextDouble();
        double percent = ((score / maxScore) * 100);
        String percentStringFormat = String.format("%.0f", percent);
        String letterGrade;

        if (score >= 0 && score <= maxScore) {
            if (percent >= 90) {
                letterGrade = "A";
            } else if (percent >= 80) {
                letterGrade = "B";
            } else if (percent >= 70) {
                letterGrade = "C";
            } else if (percent >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            System.out.println("You get a " + letterGrade + " (" + percentStringFormat + "%)");
        } else {
            System.out.println("Input score is invalid pleas input correct score 0 - " + maxScore);
        }

    }
}
