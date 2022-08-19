package com.kh.exam3;
/*
문제] ATM 은행계좌 입금, 출금, 잔액을 처리할 수 있는 프로그램을 작성하시오

메뉴] 1.계좌 개설 2.입금 3.출금 4.잔액조회 5.종료

요구사항)
	0. 계좌 개설은 최대 100구좌 까지 가능합니다.
	1. 계좌개설시 이름을 입력받도록 한다.
	2. 1회 입금한도는 10만원을 넘지 못한다.
	3. 마이너스 잔액한도는 100만원이다.
	4. 계좌개설 전에는 2~4번의 메뉴를 사용할 수 없다.

=>속성
-예금주 이름
-잔고

=>행위
-예금주 이름을 주어진 값으로 변경한다
-잔고를 주어진 값으로 변경한다
-예금주 이름을 알려 준다
-잔고를 알려 준다
-주어진 금액을 입금한다
-주어진 금액을 출금한다
-예금 계좌의 모든 데이터 값을 알려 준다
 */
public class Account {
    private int LIMIT_MONEY_ONETIME = 100_000;
    private int LIMIT_BALANCE = -1_000_000;

    private String accountOwner;
    private long balance;

    public Account(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Account(int LIMIT_MONEY_ONETIME, int LIMIT_BALANCE, String accountOwner, long balance) {
        this.LIMIT_MONEY_ONETIME = LIMIT_MONEY_ONETIME;
        this.LIMIT_BALANCE = LIMIT_BALANCE;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    //입금
    public void deposit(int money) {
        if (1 > money || money > LIMIT_MONEY_ONETIME ) {
            System.out.println("1회 입금액은" + LIMIT_MONEY_ONETIME + "미만이어야 합니다.");
            return;
        }
       this.balance += money;
    }

    //출금
    public void withdraw(int money) {
        if ( money < 1) {
            return;
        }
        if (this.balance - money < -LIMIT_BALANCE) {
            System.out.println("잔액 한도는" + LIMIT_BALANCE + "입니다");
            return;
        }
        this.balance -= money;
    }

    public String getAccountOnwer() {
        return accountOwner;
    }

    public long getBalance() {
        return balance;
    }
}
