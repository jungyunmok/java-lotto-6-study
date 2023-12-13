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

    // 게임 시작 - 로또 구매 금액 입력과 로또 발행
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

    // 우승 로또 생성
    public void setWinLotto() {
        try {
            String strNumbers = inputView.winLotto();
            String[] tempNumbers = strNumbers.split(",");
            List<Integer> winLotto= new ArrayList<>();
            for(String strNnumber : tempNumbers) {
                int number = judgement.checkRange(judgement.checkInt(strNnumber));
                judgement.checkLotto(winLotto, number);
                winLotto.add(number);
            }
            setWinBonus(winLotto);
        } catch (IllegalArgumentException e) {
            setWinLotto();
        }
    }

    // 우승 보너스 번호 생성
    public void setWinBonus(List<Integer> winLotto) {
        try {
            String strNumber = inputView.winBonus();
            int bonus = judgement.checkRange(judgement.checkInt(strNumber));
            judgement.checkBonus(winLotto, bonus);
            result = new Result(judgement, winLotto, bonus);
        } catch (IllegalArgumentException e) {
            setWinBonus(winLotto);
        }
    }
}