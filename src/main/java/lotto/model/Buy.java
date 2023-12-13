package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Buy {
    Judgement judgement;
    Lotto lotto;

    public Buy(Judgement judgement) {
        this.judgement = judgement;
    }

    // 로또 구매 1000단위
    public int countLotto(String strMoney) {
        int money = judgement.checkInt(strMoney);
        int count = 0;
        if (money % 1000 != 0) {
            System.out.println("[ERROR] 구매 금액은 1,000원 단위로 입력해주세요.");
            throw new IllegalArgumentException();
        }
        count = money / 1000;
        return count;
    }

    // 구매 개수만큼 로또 생성 후 리스트 반환
    public List<Lotto> generateLotto(int count) {
        List<Lotto> lottoGames = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            lotto = new Lotto(numbers);
            lottoGames.add(lotto);
        }
        return lottoGames;
    }
}
