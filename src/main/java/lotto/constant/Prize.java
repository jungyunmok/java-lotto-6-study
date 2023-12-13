package lotto.constant;

public enum Prize {
    FIRST(6.0, "1등", "6개 일치", 2000000000),
    SECOND(5.5, "2등", "6개 일치", 30000000),
    THIRD(5.0, "3등", "5개 일치, 보너스 볼 일치", 1500000),
    FOURTH(4.0, "4등", "4개 일치", 50000),
    FIFTH(3.0, "5등", "3개 일치", 5000);

    private final double correctCount;
    private final String rank;
    private final String description;
    private final int money;

    Prize(double correctCount, String rank, String description, int money) {
        this.correctCount = correctCount;
        this.rank = rank;
        this.description = description;
        this.money = money;
    }

    public double getCorrectCount() {
        return correctCount;
    }

    public String getRank() {
        return rank;
    }

    public String getDescription() {
        return description;
    }

    public int getMoney() {
        return money;
    }
}
