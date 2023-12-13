package lotto.view;

import lotto.constant.Prize;
import lotto.model.Lotto;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class OutputView {
    public void printLotto(List<Lotto> lottoGames) {
        System.out.println();
        System.out.println(lottoGames.size() + "개 구매했습니다.");
        for (Lotto lotto : lottoGames) {
            System.out.println(lotto.getNumbers());
        }
    }

    public void printPrize(Map<Double, Integer> rankCount, int i) {
        DecimalFormat df = new DecimalFormat("###,###");
        for (Prize prize : Prize.values()) {
            if (prize.getINDEX() == i) {
                System.out.println(prize.getRank() + ": " + prize.getDescription() + " (" + df.format(prize.getMoney()) + "원) - " + rankCount.get(prize.getCorrectCount()) + "개");
            }
        }
    }

    public void lottoResult(Map<Double, Integer> rankCount, double winRate) {
        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---");
        for (int i = 0; i < 5; i++) {
            printPrize(rankCount, i);
        }
        System.out.println("총 수익률은 " + String.format("%.1f", winRate) + "%입니다.");
    }
}
