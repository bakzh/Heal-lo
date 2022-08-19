package com.kh.exam3;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        Account account = null;

        int money = 0;

        do {
            if (account == null) {
                System.out.println("메뉴] 1.계좌 개설 5.종료");
            }else {
                System.out.println("메뉴] 2.입금 3.출금 4.잔액조회 5.종료");
            }
            System.out.print(">>");
            String menuValue = scanner.nextLine();

            switch (menuValue) {
                case "1":
                    System.out.println("이름을 입력하세요");
                    String name = scanner.nextLine();
                    account = new Account(name);
                    System.out.println(name + "님의 계좌가 개설 됐습니다");
                    break;

                case "2":
                    System.out.println("얼마를 입금하시겠습니까?");
                     money = Integer.valueOf(scanner.nextLine());
                     //입금
                     account.deposit(money);
                    break;

                case "3":
                    System.out.println("얼마를 출금하시겠습니까?");
                    money = Integer.valueOf(scanner.nextLine());
                    //출금
                    account.withdraw(money);
                    break;

                case "4":
                    long balance = account.getBalance();
                    System.out.println(account.getAccountOnwer() + "님의 잔액 : " + balance);
                    break;

                case "5":
                    if (menuValue.equals("5")) {
                        System.out.println("종료!");
                    }
                    stop = true;
                    break;
                default:
                    System.out.println("메뉴(1 or 5) 중에 실행 해주세요ㅠㅠ");
                    break;
            }

        } while (!stop);
    }
}

