package org.example;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;

public class TestJava {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(1, "C"); // 在索引为1的位置插入元素"C"

        for (String s:arrayList
             ) {
            System.out.println(s);
        }
    }
}
