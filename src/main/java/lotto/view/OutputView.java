package lotto.view;

import lotto.model.Lotto;

import java.util.List;

public class OutputView {
    public void printLotto(List<Lotto> lottoGames) {
        System.out.println();
        System.out.println(lottoGames.size() + "개 구매했습니다.");
        for (Lotto lotto : lottoGames) {
            System.out.println(lotto.getNumbers());
        }
    }

}
