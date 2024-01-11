package org.example;

import javax.swing.*;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // 使用 Function 将字符串转换为整数
        Function<String, Integer> stringToInt = s -> Integer.parseInt(s);
        Integer result = stringToInt.apply("123");
        System.out.println("String to Int: " + result);

        // 使用 andThen 连接两个 Function，将字符串先转为整数，然后乘以2
        Function<Integer, Integer> multiplyBy2_test = integer -> integer*2;
//        Function<String, Integer> multiplyBy2 = stringToInt.andThen(i -> i * 2);
        Function<String, Integer> multiplyBy2 = stringToInt.andThen(multiplyBy2_test);
        Integer multipliedResult = multiplyBy2.apply("456");
        System.out.println("String to Int and Multiply by 2: " + multipliedResult);
    }
}

