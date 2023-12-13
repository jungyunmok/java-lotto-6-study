package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class Judgement {
    // 문자열 인트 변환
    public int checkInt(String strNumber) {
        int number;
        try {
            number = Integer.parseInt(strNumber);
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 문자, 공백 없이 숫자만 입력해주세요.");
            throw new IllegalArgumentException(e);
        }
        return number;
    }

    // 숫자 6개 여부 확인
    public void checkLength(int length) {
        if (length != 6) {
            System.out.println("[ERROR] 중복되지 않는 1부터 45 사이의 숫자 6개를 쉼표로 구분하여 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    // 당첨 로또 번호 1~45 사이 유효성 검사
    public int checkRange(int number) {
        int minNumber = 1;
        int maxNumber = 45;
        if (number < minNumber || number > maxNumber) {
            System.out.println("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            throw new IllegalArgumentException();
        }
        return number;
    }

    // 당첨 로또 번호 중복 확인
    public void checkLotto(List<Integer> winLotto, int number) {
        if (winLotto.contains(number)) {
            System.out.println("[ERROR] 중복되지 않는 1부터 45 사이의 숫자 6개를 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    // 보너스 번호 중복 확인
    public void checkBonus(List<Integer> winLotto, int bonus) {
        for (int i = 0; i < winLotto.size(); i++) {
            if (bonus == winLotto.get(i)) {
                System.out.println("[ERROR] 로또 번호와 중복되지 않는 1부터 45 사이의 숫자 1개를 입력해주세요.");
                throw new IllegalArgumentException();
            }
        }
    }

    // 당첨 로또와 비교해서 등수 산출
    public double correctNumber(List<Integer> userLotto, int userBonus, List<Integer> winLotto, int winBonus) {
        double correctCount = 0.0;
        for (int number : userLotto) {
            if (winLotto.contains(number)) {
                correctCount++;
            }
        }
        if (winBonus == userBonus) {
            correctCount += 0.5;
        }
        return correctCount;
    }
}
