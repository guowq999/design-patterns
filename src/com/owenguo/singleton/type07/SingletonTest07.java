package com.owenguo.singleton.type07;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Singleton {

    private Singleton() {}

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {

        return SingletonInstance.INSTANCE;
    }
}
