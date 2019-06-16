package Lessens10;

public class App {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.openRestaurantForService("Best for ever", 90);
        restaurant.seatParty(87);
        restaurant.seatParty(1);
        restaurant.removeParty(89);
        System.out.println(restaurant.isSeatAvailable(3));
        restaurant.removeParty(5);
        System.out.println(restaurant.isSeatAvailable(10));
        restaurant.printsRestaurantSummary();
    }
}
