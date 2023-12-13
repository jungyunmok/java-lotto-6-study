package lotto.model;

import lotto.constant.Prize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    private final List<Lotto> LOTTO_GAMES;
    private final List<Integer> WIN_LOTTO;
    private final int WIN_BONUS;

    public Result(List<Lotto> lottoGames, List<Integer> winLotto, int winBonus) {
        this.LOTTO_GAMES = lottoGames;
        this.WIN_LOTTO = winLotto;
        this.WIN_BONUS = winBonus;
    }

    // 당첨 로또와 비교해서 등수 산출
    private double correctNumber(List<Integer> userLotto) {
        double correctCount = 0.0;
        for (int number : WIN_LOTTO) {
            if (userLotto.contains(number)) {
                correctCount++;
            }
        }
        if (correctCount == 5.0 && userLotto.contains(WIN_BONUS)) {
            correctCount += 0.5;
        }
        return correctCount;
    }

    // 당첨 내역 산출
    public Map<Double, Integer> winGame() {
        Map<Double, Integer> rankCount = new HashMap<>();
        for (Prize prize : Prize.values()) {
            rankCount.put(prize.getCorrectCount(), 0);
        }
        for (Lotto lotto : LOTTO_GAMES) {
            double rank = correctNumber(lotto.getNumbers());
            if (rank >= Prize.FIFTH.getCorrectCount()) {
                rankCount.put(rank, rankCount.get(rank) + 1);
            }
        }
        return rankCount;
    }

    // 수익률 계산
    public double winRate(Map<Double, Integer> rankCount) {
        int amount = 0;
        double rate;
        for (Prize prize : Prize.values()) {
            int count = rankCount.get(prize.getCorrectCount());
            amount += prize.getMoney() * count;
        }
        System.out.println(amount + "당첨금액");
        rate = ((double) amount / (LOTTO_GAMES.size() * 1000)) * 100;
        return rate;
    }
}
