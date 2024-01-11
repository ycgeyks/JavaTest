package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");

        // 使用 Consumer 输出每个水果的长度
        Consumer<String> printLength = fruit -> System.out.println(fruit + ": " + fruit.length());

        // 使用 forEach 遍历集合并应用 Consumer 操作
//        fruits.forEach(printLength);


        Consumer<String> printLength2 = fruit -> System.out.println("Length is " + fruit.length());

        // 使用 andThen 连接两个 Consumer，输出水果和其长度
        Consumer<String> printFruitAndLength = printLength.andThen(printLength2);
        fruits.forEach(printFruitAndLength);
    }
}

