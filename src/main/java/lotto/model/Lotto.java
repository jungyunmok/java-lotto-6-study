package lotto.model;

import lotto.constant.LottoInfo;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        Collections.sort(numbers);
        return numbers;
    }

    // 6자리인지 길이 검사
    private void validate(List<Integer> numbers) {
        if (numbers.size() != LottoInfo.TOTAL_LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
