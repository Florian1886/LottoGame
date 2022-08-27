package lotto;

import java.util.Set;


class Message {


  public static void start() {
    System.out.println("Start a game!");
  }

  public static void showYourNumbers(final Set<Integer> userNumbers) {
    System.out.println("Your numbers are" + userNumbers);
  }

  public static void showRandomNumbers(final Set<Integer> randomNumbers) {
    System.out.println("Random numbers are" + randomNumbers);

  }

  public static void addNumber() {
    System.out.println("Insert a number");
  }

  public static void errorNotInBound() {
    System.out.println("Not in bound");
  }
}
