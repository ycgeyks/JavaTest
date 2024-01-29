package org.example;

public class GetClassExample {
    private String name;

    public GetClassExample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GetClassExample p = new GetClassExample("程序员大彬");
        Class clz = p.getClass();
        System.out.println(clz);
        //获取类名
//        System.out.println(clz.getName());
    }
}
