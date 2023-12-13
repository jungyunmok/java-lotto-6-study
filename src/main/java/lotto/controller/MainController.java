package lotto.controller;

import lotto.model.Buy;
import lotto.model.Data;
import lotto.model.Judgement;
import lotto.model.Lotto;
import lotto.view.InputView;

import java.util.ArrayList;
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
            // 당첨로또생성 로직 추가하기!
            List<Lotto> lottoGames = buy.generateLotto(count);
            // 구매 로또 데이터에 저장하기!
        } catch (IllegalArgumentException e) {
            startGame();
        }
    }

    public void setWinLotto() {
        try {
            String numbers = inputView.winLotto();
            String[] strNumbers = numbers.split(",");
            List<Integer> winLotto= new ArrayList<>();
            for(String number : strNumbers) {
                int tempNumber = judgement.checkRange(judgement.checkInt(number));
                judgement.checkLotto(winLotto, tempNumber);
                winLotto.add(tempNumber);
            }
        } catch (IllegalArgumentException e) {
            setWinLotto();
        }
    }


}