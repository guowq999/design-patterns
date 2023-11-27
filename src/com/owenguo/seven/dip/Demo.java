package com.owenguo.seven.dip;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        // 这里就只能接受邮件信息，非常不灵活
        person.receive(new Email());
    }
}

class Person {
    public void receive(Email email ) {
        System.out.println(email.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

