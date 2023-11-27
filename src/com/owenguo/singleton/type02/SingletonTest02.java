package com.owenguo.singleton.type02;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Singleton {

    private static Singleton instance;

    private Singleton() {}

    // 这里通过静态代码块创建对象
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}