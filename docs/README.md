# 기능 구현 목록

## 기능
- [x] 로또 구메 - Buy#countLotto()
  - [x] 1000단위로 입력
  - [x] 금액을 입력하면 1,000원당 1장 발행 - Buy#generateLotto()
  - [x] 1000으로 떨어지지 않는 경우 예외처리
- [x] 당첨 로또 번호 유효성 검사 - Judgement#checkInt()
  - [x] 숫자인지 체크
  - [x] 숫자 범위는 1~45 - Judgement#checkRange()
  - [x] 서로 중복되지 않는 6개의 숫자 - Judgement#checkLotto()
  - [ ] 로또 번호와 중복되지 않는 보너스 번호 1개 - Judgement#checkBonus()
- [x] 당첨 번호 판별 - Judgement#correctNumber()
  - [x] 사용자 로또와 당첨 로또를 비교
- [x] 당첨 기준 enum - Prize
  - [x] 1등: 6개 번호 일치 / 2,000,000,000원
  - [x] 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원 
  - [x] 3등: 5개 번호 일치 / 1,500,000원 
  - [x] 4등: 4개 번호 일치 / 50,000원 
  - [x] 5등: 3개 번호 일치 / 5,000원
- [ ] 당첨 내역 저장 - Result
- [ ] 수익률 계산 - Result#winRate()
-[ ] 예외처리 - Exception
  - [ ] 잘못된 값 입력시 IllegalArgumentException 발생
  - [ ] exception 발생 후 "[ERROR]"로 시작하는 에러 문구 출력
  - [ ] 해당 부분부터 다시 입력받음

## 입력
- [x] 로또 구매 - InputView#buyLotto()
  - [x] 로또 금액 입력
- [x] 로또 당첨 번호 입력 - InputView#winLotto()
- [x] 보너스 번호 입력 - InputView#winBonus()

## 출력
- [ ] 구입한 로또 출력 - OutputView#printLotto()
  - [ ] 발행한 로또 수량 출력
  - [ ] 발행한 로또 번호 출력
    - [ ] 번호는 쉼표로 구분
    - [ ] 오름차순으로 정렬하여 보여줌
- [ ] 당첨 내역 출력 - OutputView#lottoResult()
  - [ ] 수익률 출력
      - [ ] 소수점 둘째 자리에서 반올림