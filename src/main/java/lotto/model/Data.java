package lotto.model;

import java.util.List;

public class Data {
    public List<Lotto> lottoGames;
    private final List<Integer> WIN_LOTTO;
    private final int WIN_BONUS;

    public Data(List<Integer> winLotto, int winBonus) {
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
