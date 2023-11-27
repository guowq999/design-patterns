package com.owenguo.singleton.type08;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

enum Singleton {
    INSTANCE;

    public void method() {
        System.out.println("枚举只会创建一个对象，都可以执行这个方法");
    }
}
