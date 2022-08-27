import java.util.Set;

public class LottoGame {

    public static void main(String[] args) {
        Message.start();

        LottoInputNumber lottoInputNumber = new LottoInputNumber();
        final Set<Integer> userNumbers = lottoInputNumber.getUserNumbers();

        LottoRandomNumberGenerator lottoRandomNumberGenerator = new LottoRandomNumberGenerator();
        final Set<Integer> randomNumbers = lottoRandomNumberGenerator.getRandomNumbers();

        Message.showYourNumbers(userNumbers);
        Message.showRandomNumbers(randomNumbers);

        LottoResult lottoResult = new LottoResult();
        boolean areTheSame = lottoResult.checkIfWon(userNumbers, randomNumbers);
        Set<Integer> hitNumbers = lottoResult.whichCorrect(userNumbers, randomNumbers);

        System.out.println(areTheSame);
        System.out.println(hitNumbers);
    }
}
