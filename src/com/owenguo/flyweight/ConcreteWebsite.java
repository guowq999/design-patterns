package com.owenguo.flyweight;

public class ConcreteWebsite extends Website{

    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的展示形式为：" + type + "所有者：" + user.getName());
    }
}
