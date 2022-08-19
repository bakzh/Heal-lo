package com.kh.exam1;

public class Book {
    //멤버
    //멤버 필드
    //인스턴스 멤버 필드 : 인스턴스별로 가져갈 속성 정의
    String title;
    //정적 멤버 필드 : 인스턴스 간에 공유할 속성정의
    static int bookId;

    public Book(String title) {
        super();
        this.title = title;
    }


    //멤버 메소드
    //인스턴스 멤버 메소드
    //인스턴스 멤버 메소드 바디에 인스턴스 멤버, 정적 멤버 모두 사용가능

    public String getTitle() {
        return title;
    }

    //정적 멤버 메소드
    //정적 멤버 메소드 바디에 정적 멤버만 사용가능, 인스턴스 멤버(X)
    public int getBookId() {    // 인스턴스 메소드
        return bookId;          // 정적 필드
    }

//    public static String  getBookId2() {   // 정적 메소드   , 정적메소드 안에는 정적 필드가 있어야 함 , 메모리 상에 올라오는 순서가 틀려서.
//        return title;                         // 인스턴스 필드
//    }


}
