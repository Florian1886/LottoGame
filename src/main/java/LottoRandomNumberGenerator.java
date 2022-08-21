import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoRandomNumberGenerator {

    LottoRandomNumberGenerator(){
    }

    public Set<Integer> getRandomNumbers(){
        SecureRandom random = new SecureRandom();
        return random.ints(6, 1, 40)
                .boxed()
                .collect(Collectors.toSet());
    }
}
