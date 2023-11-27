package com.owenguo.singleton.type05;

public class SingletonTest05 {
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

    public static Singleton getInstance() {
        if (instance == null) {
            // 如果同时多个线程进入到这个判断语句块中
            // 那么只是在这个同步代码快这里阻塞一下，后面也是都会执行这个创建实例的
            // 线程不安全
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
