package com.kh.exercise17.q7;

public class MyData implements Comparable<MyData> {
    String str;

    public MyData(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(MyData o) {
        int result = 0;
        if (str.length() > o.str.length()) {
            result = 1;
        } else if (str.length() < o.str.length()) {
            result = -1;
        }
        return result;
    }

    @Override
    public String toString() {
        return str;
    }

}
