import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoInputNumber {

    public Set<Integer> getUserNumbers(){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numberFromUser = getSixNumbers(scanner);
        scanner.close();
        return numberFromUser;
    }
    private Set<Integer> getSixNumbers(Scanner in){
        final Set<Integer> numberFromUser = new HashSet<>();
        while(isSixNumbersFromUser(numberFromUser)){
            Message.addNumber();
            int intNumber = in.nextInt();
            checkNumber(numberFromUser ,intNumber);
        }
        return numberFromUser;
    }

    private boolean isSixNumbersFromUser(Set<Integer> numberFromUser) {
        return numberFromUser.size()<6;
    }

    private void checkNumber(Set<Integer> numberFromUser, int intNumber) {
        if(isInRange(intNumber)){
            numberFromUser.add(intNumber);
        }else{
            Message.errorNotInBound();
        }
    }

    private boolean isInRange(int intNumber) {
        return intNumber<41 && intNumber>0;
    }


}
