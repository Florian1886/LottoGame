import java.util.Set;

public class LottoIfWinner {

    public boolean checkIfWon(Set<Integer> userNumbers , Set<Integer> randomNumbers){
        return userNumbers.contains((randomNumbers));
    }
}
