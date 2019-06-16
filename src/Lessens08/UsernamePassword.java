package Lessens08;

import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        /*Homework Part One:
          1. Create a system that checks valid username and password
          And if they both are valid then only system displays homepage
          User can only try upto 5 times with invalid login details
          if it reaches 5 times then system should be locked for 10 min
          2. Fix existing bug from the system
          3. Verify password length is greater than 8
          4. Verify password has at-least 1 numeric value
          5. Verify password does not contain username
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas enter Username:");
        String actualUsername = scan.nextLine();
        System.out.println("Pleas enter Password:");
        String actualPassword = scan.nextLine();
        String expectedUsername = "technosoft";
        String expectedPassword = "techno123";

        for (int i = 0; i <= 5; i++){
            if (actualUsername.equals(expectedUsername) && actualPassword.equals(expectedPassword)){
                System.out.println("This is your homepage");
                System.out.println("Welcome");
                if (expectedPassword.matches(".{9,}")){
                    System.out.println("Password length is greater than 8");
                    if (expectedPassword.matches(".*[0-9]")) {
                        System.out.println("Password has at-least 1 numeric value");
                        System.out.println("Excellent security");
                    }
                    else {
                        System.out.println("Password hasn't at-least 1 numeric value");
                        System.out.println("Not to bad but much better if password has at-least 1 numeric value");
                    }
                }
                else {
                    System.out.println("Password length isn't greater than 8");
                    System.out.println("Password hasn't at-least 1 numeric value");
                    System.out.println("Bad security");
                }
                if (!expectedPassword.contains(expectedUsername)){
                    System.out.println("Password does not contain username");
                }
                else {
                    System.out.println("Please input password which does not contain username");
                }
                break;
            }
            else {
                int count = 5 - i;
                System.out.println("You have " + count + " more tires");
                System.out.println("Please enter valid username or password");
                System.out.println("Pleas enter Username:");
                actualUsername = scan.nextLine();
                System.out.println("Pleas enter Password:");
                actualPassword = scan.nextLine();

                if (i == 3){
                    System.out.println("This is your last tires your account will be locked 10 minutes");
                }
                if (i == 4 && !actualUsername.equals(expectedUsername) && !actualPassword.equals(expectedPassword)){
                    System.out.println("Yor account is lock 10 minutes");
                    break;
                }
            }
        }
    }
}

