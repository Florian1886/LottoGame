package lotto;

import java.util.Set;

public class LottoGame {

  public static void main(final String[] args) {
    Message.start();

    LottoInputNumber lottoInputNumber = new LottoInputNumber();
    final Set<Integer> userNumbers = lottoInputNumber.getUserNumbers();

    LottoRandomNumberGenerator lottoRandomNumberGenerator = new LottoRandomNumberGenerator();
    final Set<Integer> randomNumbers = lottoRandomNumberGenerator.getRandomNumbers();

    Message.showYourNumbers(userNumbers);
    Message.showRandomNumbers(randomNumbers);

    LottoResult lottoResult = new LottoResult(userNumbers, randomNumbers);

    System.out.println(lottoResult.isIfWon());
    System.out.println(lottoResult.getHitNumbers());
  }
}
