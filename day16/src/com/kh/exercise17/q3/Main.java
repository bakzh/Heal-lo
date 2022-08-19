package com.kh.exercise17.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(true);
        //list -> array변환
        Boolean[] bArray = list.toArray(new Boolean[5]);
        System.out.println(Arrays.toString(bArray));

        //array -> list로 변환
        List<Boolean> list1 = Arrays.asList(bArray);
        System.out.println(list1);
    }
}
