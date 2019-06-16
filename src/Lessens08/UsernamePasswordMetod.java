package Lessens08;

import java.util.Scanner;

public class UsernamePasswordMetod {

    String actualUsername = inputUsername();
    String actualPassword = inputPasword();

    public String inputUsername (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas enter Username:");
       String username = scan.nextLine();
        return username;

    }
    public String inputPasword (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas enter Password:");
        String password = scan.nextLine();
        return password;

    }
    public boolean verifiUsernamePassword (String expectedUsername, String expectedPassword){
        for (int i = 0; i <= 5; i++) {
            if (actualUsername.equals(expectedUsername) && actualPassword.equals(expectedPassword)) {
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
                if (!expectedPassword.contains(expectedUsername)) {
                    System.out.println("Password does not contain username");
                } else {
                    System.out.println("Please input password which does not contain username");
                }
                break;
            } else {
                int count = 5 - i;
                System.out.println("You have " + count + " more tires");
                System.out.println("Please enter valid username or password");
                actualUsername = inputUsername();
                actualPassword = inputPasword();
                if (i == 3){
                    System.out.println("This is your last tires your account will be locked 10 minutes");
                }
                if (i == 4 && !actualUsername.equals(expectedUsername) && !actualPassword.equals(expectedPassword)){
                    System.out.println("Yor account is lock 10 minutes");
                    break;
                }
            }
        }
        return true;
    }
}
