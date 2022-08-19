package com.kh.exam5;

import java.util.Arrays;
import java.util.Scanner;

public class AccountMain {

    static final int NOT_FOUND = -1;

    public static void main(String[] args) {
        ShowMenu();         //메뉴 메소드 부르기
    }

    public static void ShowMenu() {
//        final int SET_UP_ACCOUNT_LIMIT = 5;
        Account[] accounts = new Account[5];
        System.out.println(Arrays.toString(accounts));
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;

        while (!stop) {
            int nullSpace = NOT_FOUND;
            String accountName = null;
            String accountNumber = null;
            int money = 0;


            System.out.println("1. 신규 2. 폐지 3. 입금 4. 출금 5. 계좌조회(개별) 6. 계좌조회(전체) 7. 종료");
            System.out.print("선택 : ");
            String select_menu = scanner.nextLine();

            switch (select_menu) {
                case "1":           //신규
                    System.out.print("이름을 입력하세요 : ");
                    accountName = scanner.nextLine();
                    nullSpace = findNullSpace(accounts);        //비어있는 요소 찾아오기
                    if (nullSpace == NOT_FOUND) {
                        System.out.println("계좌의 개설 한도가 가득 차 더 이상 생성 불가합니다.");
                        continue;
                    }
                    if (checkSameName(accounts, accountName)) {
                        System.out.println("동명이인이 존재하여 개설 불가합니다.");
                        continue;
                    }
                    accounts[nullSpace] = new Account(accountName);
                    System.out.println(accountName + "님의 신규 계좌가 생성되었습니다");
                    System.out.println(accounts[nullSpace]);
                    break;

                case "2":                                       //폐지
                    System.out.print("계좌번호를 입력하세요 : ");
                    accountNumber = scanner.nextLine();
                    nullSpace = findSpaceAccountNum(accounts, accountNumber);
                    if (nullSpace == NOT_FOUND) {
                        System.out.println("찾고자하는 계좌가 없습니다");
                        continue;
                    }


                    if (accounts[nullSpace].getBalance() == 0) {
                        accounts[nullSpace] = null;
                        System.out.println("계좌가 폐지 되었습니다");
                    } else {
                        System.out.println("잔액이 남아있어 폐지가 불가합니다.");
                    }
                    break;

                case "3":                                       //입금
                    System.out.print("입금하실 계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    nullSpace = findSpaceAccountNum(accounts, accountNumber);
                    if (nullSpace == NOT_FOUND) {
                        System.out.println("해당 계좌번호를 찾지 못 했습니다.");
                        continue;
                    }

                    System.out.println("입금액 : ");
                    money = Integer.parseInt(scanner.nextLine());

                    accounts[nullSpace].deposit(money);
                    System.out.println(accounts[nullSpace].toString());
                    break;

                case "4":                                       //출금
                    System.out.print("출금하실 계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    nullSpace = findSpaceAccountNum(accounts, accountNumber);
                    if (nullSpace == NOT_FOUND) {
                        System.out.println("해당 계좌번호를 찾지 못 했습니다.");
                        continue;
                    }

                    System.out.print("출금액 : ");
                    money = Integer.parseInt(scanner.nextLine());

                    accounts[nullSpace].withdraw(money);
                    System.out.println(accounts[nullSpace].toString());
                    break;

                case "5":                                       //계좌조회 (개별)
                    System.out.print("조회하실 계좌번호 :  ");
                    accountNumber = scanner.nextLine();
                    nullSpace = findSpaceAccountNum(accounts, accountNumber);
                    if (nullSpace == NOT_FOUND) {
                        System.out.println("조회하고자 하시는 계좌번호가 존재하지 않습니다.");
                        continue;
                    }
                    System.out.print(accounts[nullSpace].toString());
                    break;

                case "6":
                    outputAllAccount(accounts);                 //계좌조회 (전체)
                    break;

                case "7":                                       //종료
                    if (select_menu.equals("7")) {
                        System.out.println("종료!!");
                    }
                    stop = true;
                    break;
                default:
                    System.out.println("메뉴] 1~7중에서 선택해주세요! ㅠㅠ");
            }
        }
    }

    //모든 계좌정보를 출력하는 코드
    private static void outputAllAccount(Account[] accounts) {
        int usingAllAccount = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) continue;
            System.out.println(accounts[i]);
            ++usingAllAccount;
        }

        System.out.println("사용중인 계좌 수 : " + usingAllAccount);
        System.out.println("잔여 계좌 수 : " + (accounts.length - usingAllAccount));
    }


    // 베열의 비어 있는 인덱스 번호를 반환하는 코드, 없으면 NOT_FOUND(-1)을 반환함
    private static int findNullSpace(Account[] accounts) {
        int findSpace = NOT_FOUND;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                findSpace = i;
                break;
            }
        }
        return findSpace;
    }

    // 계좌번호 일치하는 인덱스 번호와 비교 후 반환하는 코드, 없으면 NOT_FOUND(-1)을 반환함
    private static int findSpaceAccountNum(Account[] accounts, String accountNumber) {
        int findSpaceAcNum = NOT_FOUND;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            }
            String tmpAccountNumber = accounts[i].getAccountNumber();
            if (tmpAccountNumber.equals(accountNumber)) {
                findSpaceAcNum = i;
                break;
            }
        }
        return findSpaceAcNum;
    }

    //동명이인 체크을 체크하는 코드
    private static boolean checkSameName(Account[] accounts, String accountName) {
        boolean chSN = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            }
            if (accounts[i].getAccountName().equals(accountName)) {
                chSN = true;
                break;
            }
        }
        return chSN;
    }
}
