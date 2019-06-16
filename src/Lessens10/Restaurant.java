package Lessens10;

public class Restaurant {

    private String name;
    private int capacity;
    private int inGuest;
    private int outGuest;
    private int usedSeat;
    private int availableSeat;

    public void seatParty(int inGuest) {
        if (inGuest > 0){
            if (inGuest <= capacity) {
                if (inGuest <= setAvailableSeatSeet()){
                    this.inGuest += inGuest;
                }
                else {
                    System.out.println("Insert number mor den " + setAvailableSeatSeet() + " please insert <= " + setAvailableSeatSeet());
                }
            }
            else {
                System.out.println("Insert number mor den " + capacity + " please insert <= " + capacity);
            }
        }
        else {
            System.out.println("Insert number is: < or = 0; Please insert mor den 0");
        }
    }

    public void openRestaurantForService(String name, int capacity){
        if (capacity > 0) {
            this.name = name;
            this.capacity = capacity;
            System.out.println("Restaurant name is: " + name + " Capacity is: " + capacity);
        }
        else {
            System.out.println("Insert number is: < or = 0; Please insert mor den 0");
        }
    }

    public boolean isSeatAvailable(int guset){
        boolean status = true;
        if (guset > 0) {
            if (guset > setAvailableSeatSeet()) {
                System.out.print("Available seat is: " + setAvailableSeatSeet() + " ");
                status = false;
            } else {
                System.out.print("Available seat is: " + setAvailableSeatSeet() + " ");
            }
        }
        else {
            System.out.print("Insert number < or = 0; Please insert mor den 0 ");
            status = false;
        }
        return status;
    }

    public void removeParty(int outGuest){
        if (outGuest > 0) {
            if (outGuest <= setUsedSeet()){
                this.outGuest += outGuest;
            }
            else {
                System.out.println("Insert number mor den used seat, it is: " + setUsedSeet() + "; please insert <= " + setUsedSeet());
            }
        }
        else {
            System.out.println("Insert number < or = 0; Please insert mor den 0");
        }
    }

    public int setUsedSeet(){
        usedSeat = (capacity - ((capacity - inGuest) + outGuest));
        return usedSeat;
    }

    public int setAvailableSeatSeet(){
        availableSeat = ((capacity - inGuest) + outGuest);
        return availableSeat;
    }

    public void printsRestaurantSummary(){
        System.out.println("Restaurant Name: " + name + "; Restaurant Capacity: " + capacity + ";");
        System.out.println("Restaurant used seat: " + setUsedSeet() +"; Restaurant available seat: " + setAvailableSeatSeet());
    }

}
