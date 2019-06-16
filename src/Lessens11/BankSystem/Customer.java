package Lessens11.BankSystem;

public class Customer {

    private String firstName;
    private String lastName;
    private Account account;
    private String userID;
    private String password;
    private String[] userIds = {"foo", "bar", "endGame", "GOT"};

    public Customer(String firstName, String lastName){

                this.firstName = firstName;
                this.lastName = lastName;
    }

    public Customer(){

        firstName = "Fake";
        lastName = "Fake";
    }

    public void addAccount(double initialBalance) {
        account = new Account();
        account.setAccountId(Account.getnextId());
        account.deposit(initialBalance);
        account.displayAccountDetails(firstName, lastName);
    }

    public void creatUserIDPassword(String userID, String password){
        if (userID.length() > 2) {
            for (int i = 0; i < userIds.length; i++) {
                if (userIds[i].equals(userID)) {
                    System.out.println("**** UserID Information ****");
                    System.out.println("This UserID already registered");
                    break;
                }
            }
        }
        else {
            System.out.println("**** UserID Information ****");
            System.out.println("UserID must be minimum 3 characters");
        }
        this.userID = userID;
        if (!password.contains(userID)) {
            if (password.matches("^(?=.*[A-Za-z])(?=.*[0-9]).{8,}")) {
                this.password = password;
            } else {
                System.out.println("**** Password Information ****");
                System.out.println("Password must contain: Minimum 8 character; at least one letter and one number");
            }
        }
        else {
            System.out.println("**** Password Information ****");
            System.out.println("Password contain userID");
        }
    }

    public String getUserID() {
        return userID;
    }

    public void withdrawBalance(double amount){
        account.withdraw(amount);
        account.displayAccountDetails(firstName,lastName);

    }

    public void removeAccount(){
        userID = null;
        firstName = null;
        lastName = null;
        account.removeAccount(firstName,lastName);
        System.out.println(" reset");
    }
}
