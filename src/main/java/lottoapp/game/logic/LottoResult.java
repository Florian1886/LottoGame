package lottoapp.game.logic;

import lottoapp.game.message.Message;

import java.util.HashSet;
import java.util.Set;

public class LottoResult {

  private void checkCorrect(final Set<Integer> userNumbers, final Set<Integer> randomNumbers) {
    Set<Integer> hitNumbers = new HashSet<>(userNumbers);
    hitNumbers.retainAll(randomNumbers);
    Message.correctHitNumbers(hitNumbers);
  }

  public void checkIfWon(final Set<Integer> userNumbers, final Set<Integer> randomNumbers) {
    if(userNumbers.contains((randomNumbers))){
      Message.ifAllHit("Yes");
    } else {
      Message.ifAllHit("No");
    }
    checkCorrect(userNumbers, randomNumbers);
  }
}
