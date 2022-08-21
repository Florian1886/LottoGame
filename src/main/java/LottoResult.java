import java.util.HashSet;
import java.util.Set;

public class LottoResult {

    public boolean checkIfWon(Set<Integer> userNumbers , Set<Integer> randomNumbers){
        return userNumbers.contains((randomNumbers));
    }
    public Set<Integer> whichCorrect(Set<Integer> userNumbers, Set<Integer> randomNumbers){
        Set<Integer> hitNumbers = new HashSet<>(userNumbers);
        hitNumbers.retainAll(randomNumbers);
        return hitNumbers;
    }
}
