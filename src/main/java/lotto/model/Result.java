package lotto.model;

import java.util.List;

public class Result {
    Judgement judgement;
    public List<Lotto> lottoGames;
    private final List<Integer> WIN_LOTTO;
    private final int WIN_BONUS;

    public Result(Judgement judgement, List<Integer> winLotto, int winBonus) {
        this.judgement = judgement;
        this.WIN_LOTTO = winLotto;
        this.WIN_BONUS = winBonus;
    }

    public List<Integer> getWinLotto() {
        return WIN_LOTTO;
    }

    public int getWinBonus() {
        return WIN_BONUS;
    }

    public List<Lotto> getLottoGames() {
        return lottoGames;
    }

    public void setLottoGames(List<Lotto> lottoGames) {
        this.lottoGames = lottoGames;
    }
}
