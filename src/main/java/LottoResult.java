import java.util.HashSet;
import java.util.Set;

public class LottoResult {

    private final boolean ifWon;
    private final Set<Integer> hitNumbers;

    public LottoResult(Set<Integer> userNumbers, Set<Integer> randomNumbers) {
        this.ifWon = this.checkIfWon(userNumbers, randomNumbers);
        this.hitNumbers = this.whichCorrect(userNumbers, randomNumbers);
    }

    private boolean checkIfWon(Set<Integer> userNumbers , Set<Integer> randomNumbers){
        return userNumbers.contains((randomNumbers));
    }
   public Set<Integer> whichCorrect(Set<Integer> userNumbers, Set<Integer> randomNumbers){
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
