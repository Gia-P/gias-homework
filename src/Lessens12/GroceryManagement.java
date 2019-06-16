package Lessens12;

/*1. When user runs the app for first time, prompt user with below messages.

Press
	 0 - To print choice options.
	 1 - To print the list of grocery items.
	 2 - To add an item to the list.
	 3 - To modify an item in the list.
	 4 - To remove an item from the list.
	 5 - To search for an item in the list.
	 6 - To quit the application.
Enter your choice:

2. Based on the choice user makes, app should perform actions accordingly
3. By pressing 0 option key should display the the choice menu
4. By pressing 1 option key should display list of grocery items
5. By pressing 2 option key should prompt user to enter item to the list
6. By pressing 3 option key should prompt user to insert item number and modify that item attached to that number
7. By pressing 4 option key should prompt user to insert item number and remove that item attached to that number
8. By pressing 5 option key should prompt user to enter the item that would like
to search and if result should come back as true if the item is found or false if it doesn't exists
6. By pressing 6 option key should quit the app

Extra Credit: Implement below functionality to app
7 - To see if list is empty.
8 - add a another functionality that you would like to see


 */

import java.util.Scanner;

public class GroceryManagement extends Lessens12.ArrayList {


    public void cycle() {
        Scanner scanner = new Scanner(System.in);
        int number;
        super.list();
        try {
            do {
                System.out.println("Enter your choice:");
                number = scanner.nextInt();
                if (number > 8 || number < 0) {
                    System.out.println("Number is out of option numbers");
                }
                    switch (number) {
                        case 0:
                            super.list();
                            break;
                        case 1:
                            super.showList();
                            break;
                        case 2:
                            super.addItem();
                            break;
                        case 3:
                            super.modifyItem();
                            break;
                        case 4:
                            super.removeItem();
                            break;
                        case 5:
                            super.searchItem();
                            break;
                        case 6:
                            System.out.println("Shopping list is empty? " + super.isEmpty());
                            break;
                        case 7:
                            super.removeAllItems();
                            break;
                    }
            }
                while (number != 8);
        } catch (Exception e) {
            System.out.println("You have to insert number");
        }
        System.out.println("Quit the application.");
        }
}
