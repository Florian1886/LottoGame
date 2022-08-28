package lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class LottoRandomNumberGenerator {
  public LottoRandomNumberGenerator() {
  }

  public Set<Integer> getRandomNumbers() {
    Set<Integer> randomSet = new HashSet<>();
    Random rand = new Random();
    while (isSixNumbersRandom(randomSet)) {
      randomSet.add(rand.nextInt(Config.LOWER_BOUND, Config.UPPER_BOUND));
    }
    return randomSet;
  }

  private boolean isSixNumbersRandom(final Set<Integer> numberFromUser) {
    return numberFromUser.size() < Config.MAX_NUMBERS;
  }

}
