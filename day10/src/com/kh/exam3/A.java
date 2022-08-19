package com.kh.exam3;

import java.io.FilterOutputStream;

public class A {
    int a = 2;
    static int b = 3;

    void abc() {
        System.out.println(a);
        System.out.println(b);
    }

    static void bcd() {
//        System.out.println(a);  // 정적 메소드에 인스턴스 멤버 사용불가
        System.out.println(b);
    }
}
