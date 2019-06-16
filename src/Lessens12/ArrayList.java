package Lessens12;

import java.util.Scanner;

public class ArrayList {

    public void list(){
        String[] list = new String[9];
        list[0] = ("0 - To print choice options.");
        list[1] = ("1 - To print the list of grocery items.");
        list[2] = ("2 - To add an item to the list.");
        list[3] = ("3 - To modify an item in the list.");
        list[4] = ("4 - To remove an item from the list.");
        list[5] = ("5 - To search for an item in the list.");
        list[6] = ("6 - To see if list is empty.");
        list[7] = ("7 - remove all items");
        list[8] = ("8 - To quit the application.");

        System.out.println("Pres");
        for (String li : list)
            System.out.println("     " + li);
//        for (int i = 0; i < list.length; i++){
//            System.out.println("     " + list[i]);
//        }
    }

    private java.util.ArrayList<String> shoppingList = new java.util.ArrayList<>();
    Scanner scanItem = new Scanner(System.in);

    public void showList(){
        if (!isEmpty()) {
            System.out.println("==Shopping list==");
            for (String shopList : shoppingList)
                System.out.println(shopList);
            System.out.println("==============");
        }
        else {
            System.out.println("Shopping list is empty");
        }
    }

    public void addItem(){
        String item;
        do {
            System.out.println("Add item");
            item = scanItem.nextLine().toLowerCase();
            if (!item.equalsIgnoreCase("stop")) {
                shoppingList.add(item);
            }
            else {
                break;
            }
            System.out.println("If you finished put \"stop\" ");
        }
        while (!item.equalsIgnoreCase("stop"));

    }

    public void modifyItem(){
        if (!isEmpty()) {
            System.out.println("Insert old item");
            String findItem = scanItem.nextLine().toLowerCase();
            if (shoppingList.contains(findItem)) {
                System.out.println("Add new item");
                String replaceItem = scanItem.nextLine();
                int index = shoppingList.indexOf(findItem);
                shoppingList.set(index, replaceItem);
            } else {
                System.out.println("\"" + findItem + "\"" + " this item doesn't contains shopping list");
            }
        }
        else {
            System.out.println("Shopping list is empty");
        }
    }

    public void removeItem(){
        if (!isEmpty()) {
            System.out.println("Insert removed item");
            String removeItem = scanItem.nextLine().toLowerCase();
            if (shoppingList.contains(removeItem)) {
                shoppingList.remove(removeItem);
            } else {
                System.out.println("\"" + removeItem + "\"" + " this item doesn't contains shopping list can't remove");
            }
        }
        else {
            System.out.println("Shopping list is empty");
        }
    }

    public void searchItem(){
        if (!isEmpty()) {
            System.out.println("Insert item to search");
            String searchItem = scanItem.nextLine().toLowerCase();
            boolean search = shoppingList.contains(searchItem);
            System.out.println("\"" + searchItem + "\"" + " is in the list? " + search);
        }
        else {
            System.out.println("Shopping list is empty");
        }
    }

    public boolean isEmpty(){
        boolean isEmpty = shoppingList.isEmpty();
        return isEmpty;
    }

    public void removeAllItems(){
        if (!isEmpty()) {
            //shoppingList.removeAll(shoppingList);
            shoppingList.clear();
            System.out.println("Lists all items is removed");
        }
        else {
            System.out.println("Shopping list is empty");
        }
    }
}
