package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.constant.LottoInfo;

import java.util.ArrayList;
import java.util.List;

public class Buy {
    Lotto lotto;

    // 로또 구매 1000단위
    public int countLotto(int money) {
        int count = 0;
        if (money < LottoInfo.LOTTO_UNIT || money % LottoInfo.LOTTO_UNIT != 0) {
            System.out.println("[ERROR] 구매 금액은 1,000원 단위로 입력해주세요.");
            throw new IllegalArgumentException();
        }
        count = money / LottoInfo.LOTTO_UNIT;
        return count;
    }

    // 구매 개수만큼 로또 생성 후 리스트 반환
    public List<Lotto> generateLotto(int count) {
        List<Lotto> lottoGames = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(LottoInfo.MIN_NUMBER, LottoInfo.MAX_NUMBER, LottoInfo.TOTAL_LENGTH);
            lotto = new Lotto(numbers);
            lottoGames.add(lotto);
        }
        return lottoGames;
    }
}