package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    // 로또 구매 금액 입력
    public String buyLotto() {
        System.out.println("구입금액을 입력해 주세요.");
        String money = Console.readLine();
        return money;
    }

    // 당첨 번호 입력
    public String winLotto() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String numbers = Console.readLine();
        return numbers;
    }

    // 보너스 번호 입력
    public String winBonus() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonus = Console.readLine();
        return bonus;
    }
}
