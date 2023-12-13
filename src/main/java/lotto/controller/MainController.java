package lotto.controller;

import lotto.model.Buy;
import lotto.model.Result;
import lotto.model.Judgement;
import lotto.model.Lotto;
import lotto.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    InputView inputView;
    Judgement judgement;
    Buy buy;
    Result result;

    public MainController() {
        inputView = new InputView();
        judgement = new Judgement();
        buy = new Buy();
    }

    // 게임 시작 - 로또 구매 금액 입력과 로또 발행
    public void startGame() {
        try {
            String strMoney = inputView.buyLotto();
            int money = judgement.checkInt(strMoney);
            int count = buy.countLotto(money);
            List<Lotto> lottoGames = buy.generateLotto(count);
            // 구매 로또 출력
            setWinLotto(lottoGames);
        } catch (IllegalArgumentException e) {
            startGame();
        }
    }

    // 우승 로또 생성
    public void setWinLotto(List<Lotto> lottoGames) {
        try {
            String strNumbers = inputView.winLotto();
            String[] tempNumbers = strNumbers.split(",");
            List<Integer> winLotto = new ArrayList<>();
            for (String strNnumber : tempNumbers) {
                int number = judgement.checkRange(judgement.checkInt(strNnumber));
                judgement.checkLotto(winLotto, number);
                winLotto.add(number);
            }
            setWinBonus(lottoGames, winLotto);
        } catch (IllegalArgumentException e) {
            setWinLotto(lottoGames);
        }
    }

    // 우승 보너스 번호 생성
    public void setWinBonus(List<Lotto> lottoGames, List<Integer> winLotto) {
        try {
            String strNumber = inputView.winBonus();
            int bonus = judgement.checkRange(judgement.checkInt(strNumber));
            judgement.checkBonus(winLotto, bonus);
            result = new Result(judgement, lottoGames, winLotto, bonus);
        } catch (IllegalArgumentException e) {
            setWinBonus(lottoGames, winLotto);
        }
    }
}