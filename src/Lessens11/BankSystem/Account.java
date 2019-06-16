package Lessens11.BankSystem;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Account {

    private double balance;
    private String accountId;
    private static int nextId = 0;
    private Date accountCreationDate;
    private Date accountRemoveDate;
    public static final String ROUTING_NUMBER = "021000021";

    public void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
        }
        else {
            JOptionPane.showMessageDialog(null,"Add amount must be more den 0 (zero)");
        }
    }

    public void withdraw(double amount){
        if (amount <= balance) {
            if (amount > 0) {
                balance = balance - amount;
            }
            else {
                JOptionPane.showMessageDialog(null,"Withdraw amount must be more den 0 (zero)");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Withdraw amount more den balance");
        }
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
        Date curentDate = new Date();
        accountCreationDate = curentDate;
    }

    public static String getnextId(){
        return "ACCT#: " + Account.nextId++;
    }

    public void displayAccountDetails(String firstName, String lastName){

        System.out.println("**** Account Information ****");
        System.out.println(" ID: " + accountId);
        System.out.println(" Balance: " + balance);
        System.out.println(" Routing Number: " + ROUTING_NUMBER);
        System.out.println(" First Name: " + firstName);
        System.out.println(" Last Name: " + lastName);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM / dd / yyyy hh:mm:ss a");
        System.out.println(" Account creation date is: " + dateFormat.format(accountCreationDate));
    }

    public void removeAccount(String firstName,String lastName){

        System.out.println("**** Account Information ****");
        balance = 0;
        accountId = null;
        System.out.println(" ID: " + accountId);
        System.out.println(" Balance: " + balance);
        System.out.println(" Routing Number: " + ROUTING_NUMBER);
        System.out.println(" First Name: " + firstName);
        System.out.println(" Last Name: " + lastName);
        Date removeDate = new Date();
        accountRemoveDate = removeDate;
        SimpleDateFormat dateFor = new SimpleDateFormat("EEE, MMM / dd / yyyy hh:mm:ss a");
        System.out.println(" Account remove date is: " + dateFor.format(accountRemoveDate));
    }
}
