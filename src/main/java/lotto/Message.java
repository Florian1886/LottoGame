package lotto;

import java.util.Set;


public class Message {


  public static void start() {
    System.out.println("Start a game!");
  }

  public static void showYourNumbers(final Set<Integer> userNumbers) {
    System.out.println("Your numbers are" + userNumbers);
  }

  public static void showRandomNumbers(final Set<Integer> randomNumbers) {
    System.out.println("Random numbers are" + randomNumbers);

  }

  static void addNumber() {
    System.out.println("Insert a number");
  }

  static void errorNotInBound() {
    System.out.println("Not in bound");
  }

  static void correctHitNumbers(Set<Integer> hitNumbers) {
    System.out.println("You hit the numbers: " + hitNumbers);
  }

  static void ifAllHit(String ifWon) {
    System.out.println("Did you guess all the numbers?: " + ifWon
    );
  }
}
