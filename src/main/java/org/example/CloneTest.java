package org.example;

public class CloneTest implements Cloneable{
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    private String a;
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest ct1 = new CloneTest();
        ct1.setA("aaaa");
        CloneTest ct2 = ct1.clone();
        System.out.println(ct2.getA());
        System.out.println(ct1.equals(ct2));
    }

    @Override
    public CloneTest clone() throws CloneNotSupportedException {
//            CloneTest clone = (CloneTest) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (CloneTest) super.clone();
    }
}

