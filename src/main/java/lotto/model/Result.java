package lotto.model;

import java.util.List;

public class Result {
    Judgement judgement;
    public List<Lotto> LOTTO_GAMES;
    private final List<Integer> WIN_LOTTO;
    private final int WIN_BONUS;

    public Result(Judgement judgement, List<Lotto> lottoGames, List<Integer> winLotto, int winBonus) {
        this.judgement = judgement;
        this.LOTTO_GAMES = lottoGames;
        this.WIN_LOTTO = winLotto;
        this.WIN_BONUS = winBonus;
    }

    public List<Lotto> getLottoGames() {
        return LOTTO_GAMES;
    }

    public List<Integer> getWinLotto() {
        return WIN_LOTTO;
    }

    public int getWinBonus() {
        return WIN_BONUS;
    }
}
