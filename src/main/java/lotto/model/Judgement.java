package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class Judgement {
    public int checkInt(String strNumber) {
        int number;
        try {
            number = Integer.parseInt(strNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
        return number;
    }

    public double checkLotto(List<Integer> userLotto, int userBonus, List<Integer> winLotto, int winBonus) {
        List<Integer> rankCount = new ArrayList<>();
        double correctCount = 0.0;
        for(int number : userLotto) {
            if(winLotto.contains(number)) {
                correctCount++;
            }
        }
        if(winBonus == userBonus) {
            correctCount += 0.5;
        }
        return correctCount;
    }
}
