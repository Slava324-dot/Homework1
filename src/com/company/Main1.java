package com.company;

public class Main1 {
    static int x = 0;


    public static void main(String[] args) {
        a (x);
        System.out.println("Метод main " + x);


    }
    public static void a(int x) {
        x += 5;
        b(x);
        System.out.println("Метод a " + x);

    }

    public static void b(int x) {
        x += 5;
        с (x);
        System.out.println("Метод b " + x);

    }

    public static void с(int x) {
        x += 5;
        System.out.println("Метод с " + x);

    }


}