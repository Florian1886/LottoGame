import java.util.Set;

public class Message {


    public static void start() {
        System.out.println("Start a game!");
    }

    public static void showYourNumbers(Set<Integer> userNumbers) {
        System.out.println("Your numbers are" + userNumbers);
    }

    public static void showRandomNumbers(Set<Integer> randomNumbers) {
        System.out.println("Random numbers are" + randomNumbers);

    }

    public static void addNumber() {
        System.out.println("Insert a number");
    }

    public static void errorNotInBound() {
        System.out.println("Not in bound");
    }
}
