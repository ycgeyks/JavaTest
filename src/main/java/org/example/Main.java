package org.example;

class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }

    void test() {
        System.out.println("PPPPPP");
    }

    void test2() {
        System.out.println("P222222");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }

    @Override
    void test() {
        System.out.println("CCCCCCCC");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent.staticMethod(); // 输出：Static method in Parent class
        Child.staticMethod();  // 输出：Static method in Child class

        Parent parent = new Parent();
        Child child = new Child();
        parent.staticMethod(); // 输出：Static method in Parent class
        child.staticMethod();  // 输出：Static method in Parent class
        Parent parent2=(Parent) child;
        parent2.staticMethod();// 输出：Static method in Parent class

        child.test();       //输出：CCCCCCCC
        child.test2();      //输出：P222222
        parent2.test();     //输出：CCCCCCCC

        System.out.println(parent2 instanceof Parent);      //true
        System.out.println(parent2 instanceof Child);       //true

        System.out.println(child.hashCode()+"========="+Integer.toHexString(child.hashCode())+"======"+child.toString());


    }
}
