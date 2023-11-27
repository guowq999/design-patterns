package com.owenguo.singleton.type01;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Singleton {

    // 1.构造方法私有化
    private Singleton() {}

    // 2.创建一个变量来保存实例对象
    private final static Singleton instance = new Singleton();

    // 3.通过一个公共的方法来获取这个对象
    public static Singleton getInstance() {
        return instance;
    }
}