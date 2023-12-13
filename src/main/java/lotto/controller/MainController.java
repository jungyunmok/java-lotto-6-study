package lotto.controller;

import lotto.model.Buy;
import lotto.model.Data;
import lotto.model.Judgement;
import lotto.model.Lotto;
import lotto.view.InputView;

import java.util.List;

public class MainController {
    InputView inputView;
    Judgement judgement;
    Buy buy;
    Data data;

    public void startGame() {
        try {
            String strMoney = inputView.buyLotto();
            int money = judgement.checkInt(strMoney);
            int count = buy.countLotto(money);
            List<Lotto> lottoGames = buy.generateLotto(count);
            data = new Data(lottoGames);
        } catch (IllegalArgumentException e) {
            startGame();
        }
    }
}