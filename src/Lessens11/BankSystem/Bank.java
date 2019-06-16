package Lessens11.BankSystem;

public class Bank {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Gia", "Pachkhatashvili");
        customer1.creatUserIDPassword("gia123","gia423gia");
        customer1.addAccount(200);


        Customer customer2 = new Customer("Liza", "Pachkhatashvili");
        customer2.addAccount(400);
        customer2.withdrawBalance(200);

        Customer customer3 = new Customer("Khat","Sherman");
        customer3.addAccount(1000);
        customer2.removeAccount();
        customer3.addAccount(300);
        System.out.println(" User ID: " + customer1.getUserID());
    }
}
