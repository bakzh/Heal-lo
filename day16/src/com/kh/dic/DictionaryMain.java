package com.kh.dic;

import java.util.Scanner;

public class DictionaryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        String menu;

        while (!stop) {
            System.out.println("<영어 단어장> 메뉴] 1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료");
            System.out.print("메뉴 선택: ");
            menu = scanner.nextLine();

            switch (menu) {
                case "1":   //저장
                    try {
                        Dictionary.saveDictionary();
                    } catch (DictionaryException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":   //검색
                    Dictionary.searchDictionary();
                    break;
                case "3":   //수정
                    Dictionary.updateDictionary();
                    break;
                case "4":   //삭제
                    Dictionary.deleteDictionary();
                    break;
                case "5":   //목록
                    Dictionary.listDictionary();
                    break;
                case "6":   //색인
                    Dictionary.indexDictionary();
                    break;
                case "7":   //통계
                    Dictionary.statsDictionary();
                    break;
                case "8":   //종료
                    System.out.println("종료~!");
                    stop = true;
                    continue;
                default:
                    System.out.println("메뉴번호 중 선택해주세요!");
                    break;
            }
        }
    }
}
