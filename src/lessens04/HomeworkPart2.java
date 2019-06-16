package lessens04;

public class HomeworkPart2 {

    public static void main(String[] args) {

        String myStatment = "I am a good programmer";
        int length = myStatment.length();
        String lowercase = myStatment.toLowerCase();
        boolean contains = myStatment.contains("mohammad");
        char index = myStatment.charAt(5);
        boolean empty = myStatment.isEmpty();
        boolean compare = myStatment.equals("technosoft");
        boolean isMessageStarts = myStatment.startsWith("Welcome");
        boolean isMessageEnds = myStatment.endsWith("Good Bye");

        System.out.println("My statment is: " + myStatment);
        System.out.println("The length of \"myStatment\" is: " + length);
        System.out.println("My statment on lowercase luck lick: " + lowercase);
        System.out.println("My statment contains mohammad? " + contains);
        System.out.println("The is 5th index of the statement: " +index+ ".");
        System.out.println("My statment is empty? " + empty);
        System.out.println("compare the my statment with \"technosoft\" is: " + compare);
        System.out.println("Is message starts with \"Welcome\"? " + isMessageStarts);
        System.out.println("Is message ends with \"Good Bye\"? " + isMessageEnds);
    }
}
