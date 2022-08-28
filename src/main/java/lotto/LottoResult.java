package lotto;

import java.util.HashSet;
import java.util.Set;

public class LottoResult {


  public LottoResult(final Set<Integer> userNumbers, final Set<Integer> randomNumbers) {
    this.checkIfWon(userNumbers, randomNumbers);
    this.checkCorrect(userNumbers, randomNumbers);
  }

  private void checkIfWon(final Set<Integer> userNumbers, final Set<Integer> randomNumbers) {
    if(userNumbers.contains((randomNumbers))){
      Message.ifAllHit("Yes");
    } else {
      Message.ifAllHit("No");
    }
  }


  private void checkCorrect(final Set<Integer> userNumbers, final Set<Integer> randomNumbers) {
    Set<Integer> hitNumbers = new HashSet<>(userNumbers);
    hitNumbers.retainAll(randomNumbers);
    Message.correctHitNumbers(hitNumbers);
  }
}
