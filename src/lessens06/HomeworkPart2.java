package lessens06;

import java.util.Scanner;

public class HomeworkPart2 {

    public static void main(String[] args) {

        Scanner moude = new Scanner(System.in);
        System.out.println("Insert mode tip \"P\"; \"D\"; \"N\" or \"R\":");
        String inMoud = moude.nextLine();
        boolean paralel = true;
        boolean backCamera = false;
        String driveType = "";


        if (inMoud.equalsIgnoreCase("P")){
            if (paralel){
                System.out.println("I can park between two cars");
            }
            else {
                System.out.println("Parking type isn't parallel");
            }
        }
        else if (inMoud.equalsIgnoreCase("D")){
            System.out.println("I can put drive type to Snow type, Sport Type or Regular type");
            if (driveType.equalsIgnoreCase("Snow")){
                System.out.println("Put drive type to Snow type");
            }
            else if (driveType.equalsIgnoreCase("Regular")){
                System.out.println("Put drive type to Regular type");
            }
            else {
                System.out.println("Put drive type to Sport Type");
            }
        }
        else if (inMoud.equalsIgnoreCase("N")){
            System.out.println("I can put car in car wash station");
        }
        else if (inMoud.equalsIgnoreCase("R")){
            if (backCamera){
                System.out.println("I can only reverse the car");
            }
            else {
                System.out.println("I can only reverse the car but car not activate back camera");
            }
        }
        else {
            System.out.println("Invalid mode type, please check your car mode");
        }
    }
}
