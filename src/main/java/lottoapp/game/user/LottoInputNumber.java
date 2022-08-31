package lottoapp.game.user;

import lottoapp.game.config.Config;
import lottoapp.game.message.Message;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoInputNumber {


  public Set<Integer> getUserNumbers() {
    Scanner scanner = new Scanner(System.in);
    Set<Integer> numberFromUser = getSixNumbers(scanner);
    scanner.close();
    return numberFromUser;
  }

  private Set<Integer> getSixNumbers(final Scanner in) {
    final Set<Integer> numberFromUser = new HashSet<>();
    while (isSixNumbersFromUser(numberFromUser)) {
      Message.addNumber();
      int intNumber = in.nextInt();
      checkNumber(numberFromUser, intNumber);
    }
    return numberFromUser;
  }

  private boolean isSixNumbersFromUser(final Set<Integer> numberFromUser) {
    return numberFromUser.size() < Config.MAX_NUMBERS;
  }

  private void checkNumber(final Set<Integer> numberFromUser, final int intNumber) {
    if (isInRange(intNumber)) {
      numberFromUser.add(intNumber);
    } else {
      Message.errorNotInBound();
    }
  }

  private boolean isInRange(final int intNumber) {
    return intNumber <= Config.UPPER_BOUND && intNumber >= Config.LOWER_BOUND;
  }


}
