package com.kh.dic;

import java.util.*;

public class Dictionary {
    static TreeMap<String, String> dictionary = new TreeMap<>();
    static Scanner scanner = new Scanner(System.in);

    static String word;
    static String mean;

    //저장
    public static void saveDictionary() throws DictionaryException {

        if (dictionary.size() > 4) {    //최대갯수
            System.out.println("최대 5개 단어만 저장할 수 있습니다");
            return;
        }
        else {
        System.out.println("등록할 단어와 뜻을 입력하세요");
        System.out.print("단어 : ");
            word = scanner.nextLine();
            if (dictionary.containsKey(word)) {  //중복체크
                throw new DictionaryException("이미 등록되었습니다.");
            }else
                System.out.print("뜻 : ");
            mean = scanner.nextLine();
            dictionary.put(word, mean);
            System.out.println("단어 등록이 완료 됐습니다!");
        }
    }

    //검색
    public static void searchDictionary() {
        System.out.print("검색할 단어를 입력하세요: ");
        word = scanner.nextLine().toLowerCase();
        if (dictionary.get(word) == null) {
            System.out.println("단어를 검색할 수 없습니다");
            return;
        }
        System.out.println(word + ": " + dictionary.get(word));
    }

    //수정
    public static void updateDictionary() {
        System.out.print("수정하고자하는 단어를 입력하세요: ");
        word = scanner.nextLine().toLowerCase();
        if (dictionary.get(word) == null) {
            System.out.println("단어를 검색할 수 없습니다");
            return;
        }
        System.out.print("수정할 뜻을 입력하세요: ");
        mean = scanner.nextLine();
        dictionary.put(word, mean);
        System.out.println("단어의 뜻을 수정하였습니다");
        System.out.println("결과= " + word + ": " + dictionary.get(word));
    }

    //삭제
    public static void deleteDictionary() {
        System.out.print("삭제할 단어를 입력하세요: ");
        word = scanner.nextLine().toLowerCase();
        if (dictionary.get(word) == null) {
            System.out.println("단어를 검색할 수 없습니다");
            return;
        }
        dictionary.remove(word);
        System.out.println("단어를 삭제 하였습니다");
    }


    //목록
    public static void listDictionary() {
        System.out.println("목록] 1.오름차순 2.내림차순");
        System.out.print(">>");
        String list = scanner.nextLine();
        if (list.equals("1")) {
            System.out.println("==========================");
            System.out.println(dictionary);
            System.out.println("==========================");
        }else if (list.equals("2")){
            System.out.println("==========================");
            System.out.println(dictionary.descendingMap());
            System.out.println("==========================");
        }
    }

    //색인
    public static void indexDictionary() {

    }

    //통계
    public static void statsDictionary() {
        System.out.println("저장된 단어 갯수: " + dictionary.size());
        System.out.println("단어의 문자수가 가장 많은 단어: "+ dictionary.lastKey());
        System.out.println("단어 글자 수 내림차순(단어만): " + dictionary.descendingKeySet());
    }
}





