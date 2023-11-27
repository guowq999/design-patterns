package com.owenguo.singleton.type04;

public class SingletonTest04 {
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

    // 在getInstance方法上增加synchronized，同时只能有一个线程执行该方法
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
