
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoRandomNumberGenerator {

    LottoRandomNumberGenerator(){
    }

    public Set<Integer> getRandomNumbers(){
        Set<Integer> randomSet = new HashSet<>();
        Random rand = new Random();
        while(isSixNumbersRandom(randomSet)){
            randomSet.add(rand.nextInt(0,40));
        }
        return randomSet;
    }

    private boolean isSixNumbersRandom(Set<Integer> numberFromUser) {
        return numberFromUser.size()<6;
    }

}
