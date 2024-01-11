package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceExample {
    // 静态方法

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        // 静态方法引用
        words.forEach(MethodReferenceExample::printWord);

        // 实例方法引用
        Consumer<String> consumer = new MethodReferenceExample()::printUpperCase;
        words.forEach(consumer);

        // 对象方法引用
        words.forEach(String::toUpperCase);

        // 构造方法引用
        words.stream()
                .map(StringBuilder::new)
                .forEach(System.out::println);
    }
    static void printWord(String word) {
        System.out.println(word);
    }

    // 实例方法
    void printUpperCase(String word) {
        System.out.println(word.toUpperCase());
    }
}

