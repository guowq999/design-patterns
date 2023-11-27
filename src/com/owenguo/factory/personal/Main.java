package com.owenguo.factory.personal;

import com.owenguo.factory.personal.make.MakePizza;

public class Main {
    public static void main(String[] args) {
        MakePizza makePizza = new MakePizza();
        makePizza.make("奶酪披萨");
    }
}
