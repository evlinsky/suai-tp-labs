package ru.suai.example;

public class Main {
    public static void main(String args[]) {
        Vector v1 = new Vector(5);
        Vector v2 = new Vector(5);
        v1.set(0, 1);
        v1.set(1, 1);
        v1.set(2, 1);
        v1.set(3, 1);
        v1.set(4, 1);

        v2.set(0, 1);
        v2.set(1, 1);
        v2.set(2, 1);
        v2.set(3, 1);
        v2.set(4, 1);

        System.out.println(v1.sum(v2));
        System.out.println(v1.sub(v2));
    }
}
