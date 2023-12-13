package lotto.constant;

public enum Prize {
    FIRST(0, 6.0, "1등", "6개 일치", 2000000000),
    SECOND(1, 5.5, "2등", "5개 일치, 보너스 볼 일치", 30000000),
    THIRD(2, 5.0, "3등", "5개 일치", 1500000),
    FOURTH(3, 4.0, "4등", "4개 일치", 50000),
    FIFTH(4, 3.0, "5등", "3개 일치", 5000);

    private final int INDEX;
    private final double CORRECT_COUNT;
    private final String RANK;
    private final String DESCRIPTION;
    private final int MONEY;

    Prize(int index, double correctCount, String rank, String description, int money) {
        this.INDEX = index;
        this.CORRECT_COUNT = correctCount;
        this.RANK = rank;
        this.DESCRIPTION = description;
        this.MONEY = money;
    }

    public int getINDEX() {
        return INDEX;
    }

    public double getCorrectCount() {
        return CORRECT_COUNT;
    }

    public String getRank() {
        return RANK;
    }

    public String getDescription() {
        return DESCRIPTION;
    }

    public int getMoney() {
        return MONEY;
    }
}