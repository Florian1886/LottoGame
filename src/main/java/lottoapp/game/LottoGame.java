package lottoapp.game;

import lottoapp.Game;
import lottoapp.game.user.LottoInputNumber;
import lottoapp.game.logic.LottoRandomNumberGenerator;
import lottoapp.game.logic.LottoResult;
import lottoapp.game.message.Message;

import java.util.Set;

public class LottoGame implements Game {

  private final  LottoInputNumber lottoInputNumber = new LottoInputNumber();
  private final LottoRandomNumberGenerator lottoRandomNumberGenerator = new LottoRandomNumberGenerator();
  private final LottoResult lottoResult = new LottoResult();
  public void play() {
    Message.start();
    final Set<Integer> userNumbers = lottoInputNumber.getUserNumbers();
    final Set<Integer> randomNumbers = lottoRandomNumberGenerator.getRandomNumbers();
    Message.showYourNumbers(userNumbers);
    Message.showRandomNumbers(randomNumbers);
    lottoResult.checkIfWon(userNumbers, randomNumbers);
  }
}
