package lotto.model;

public class Buy {
    Judgement judgement;

    public Buy(Judgement judgement) {
        this.judgement = judgement;
    }

    // 로또 구매 1000단위
    public int newLott(String strMoney) {
        int money = judgement.checkInt(strMoney);
        int count = 0;
        if (money % 1000 != 0) {
            System.out.println("[ERROR] 구매 금액은 1,000원 단위로 입력해주세요.");
            throw new IllegalArgumentException();
        }
        count = money / 1000;
        return count;
    }
}
