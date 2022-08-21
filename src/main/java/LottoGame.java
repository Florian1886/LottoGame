import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoGame {

    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        Set<Integer> randomNumbers = new HashSet<>();
        LottoInputNumber lottoInputNumber = new LottoInputNumber();
        Set<Integer> userNumbers = lottoInputNumber.getSixNumbers(scanner);
        Random rand = new Random();
        int randomNumber;
        while (randomNumbers.size() != 6) {
            randomNumber = rand.nextInt(40)+1;
            if (randomNumbers.contains(randomNumber)) {
                continue;
            }
            randomNumbers.add(randomNumber);
        }
        System.out.println("Twoje numery");
        System.out.println(userNumbers);
        System.out.println("Generator");
        System.out.println(randomNumbers);
        boolean areTheSame = userNumbers.equals(randomNumbers);
        System.out.println(areTheSame);
    }
}
