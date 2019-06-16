package lessens06;


public class HomeworkPart1 {

    public static void main(String[] args) {

        boolean isGuestOneVegan = false;
        boolean isGuesttwoVegan = false;

        if (isGuestOneVegan && isGuesttwoVegan){
            System.out.println("Here are Vegan Special");
        }
        else if (isGuestOneVegan || isGuesttwoVegan){
            System.out.println("Here is one Vegan Special and one Regular Special");
        }
        else {
            System.out.println("You can chose anything on the menu");
        }
    }
}
