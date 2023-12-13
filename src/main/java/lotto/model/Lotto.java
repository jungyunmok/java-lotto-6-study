package lotto.model;

import lotto.constant.LottoInfo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers.stream().sorted().collect(Collectors.toList());
    }

    // 중복없는 숫자 6개인지 검사
    private void validate(List<Integer> numbers) {
        if (numbers.size() != LottoInfo.TOTAL_LENGTH) {
            throw new IllegalArgumentException();
        }
        for (int number : numbers) {
            if (Collections.frequency(numbers, number) > 1) {
                throw new IllegalArgumentException();
            }
        }
    }
}
