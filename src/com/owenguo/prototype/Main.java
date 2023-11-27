package com.owenguo.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep();
        sheep.name = "小羊";
        sheep.age = "1";
        Sheep firend = new Sheep();
        firend.name = "大羊";
        firend.age = "2";
        sheep.friend = firend;

        Sheep clone = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(clone);
    }
}
