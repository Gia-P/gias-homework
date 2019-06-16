package Lessens08;

public class UseUsernameMetods {
    public static void main(String[] args) {
        UsernamePasswordMetod usernamePasswordMetod = new UsernamePasswordMetod();

        String username = "technosoft";
        String password = "techno123";

        usernamePasswordMetod.verifiUsernamePassword(username, password);
    }
}
