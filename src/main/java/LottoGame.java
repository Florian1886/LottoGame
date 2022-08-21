import java.util.Set;

public class LottoGame {

    public static void main(String[] args) {
        MessageStart.start();

        LottoInputNumber lottoInputNumber = new LottoInputNumber();
        final Set<Integer> userNumbers = lottoInputNumber.getUserNumbers();

        LottoRandomNumberGenerator lottoRandomNumberGenerator = new LottoRandomNumberGenerator();
        final Set<Integer> randomNumbers = lottoRandomNumberGenerator.getRandomNumbers();

        System.out.println("Twoje numery");
        System.out.println(userNumbers);
        System.out.println("Generator");
        System.out.println(randomNumbers);
        LottoIfWinner lottoIfWinner = new LottoIfWinner();
        boolean areTheSame = lottoIfWinner.checkIfWon(userNumbers, randomNumbers);
        System.out.println(areTheSame);
    }
}
