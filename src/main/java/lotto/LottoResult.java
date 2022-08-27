package lotto;

import java.util.HashSet;
import java.util.Set;

public class LottoResult {

  private final boolean ifWon;
  private final Set<Integer> hitNumbers;

  public LottoResult(final Set<Integer> userNumbers, final Set<Integer> randomNumbers) {
    this.ifWon = this.checkIfWon(userNumbers, randomNumbers);
    this.hitNumbers = this.checkCorrect(userNumbers, randomNumbers);
  }

  private boolean checkIfWon(final Set<Integer> userNumbers, final Set<Integer> randomNumbers) {
    return userNumbers.contains((randomNumbers));
  }


  public Set<Integer> checkCorrect(final Set<Integer> userNumbers, final Set<Integer> randomNumbers) {
    Set<Integer> hitNumbers = new HashSet<>(userNumbers);
    hitNumbers.retainAll(randomNumbers);
    return hitNumbers;
  }

  public boolean isIfWon() {
    return ifWon;
  }

  public Set<Integer> getHitNumbers() {
    return hitNumbers;
  }
}
