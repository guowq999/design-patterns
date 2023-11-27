package com.owenguo.seven.dip.improve;

public class Demo {

    public static void main(String[] args) {
        Person person = new Person();
        //当为电子邮件时，传入邮件对象
        person.receive(new Email());
        //当为微信时，传入微信对象
        person.receive(new WeiXin());
    }

}

//定义接口
interface IReceiver {
    public String getInfo();
}
//原电子邮件类，实现接口
class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

//增加微信
class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}

//方法中传入接口
class Person {
    //这里我们是对接口的依赖
    public void receive(IReceiver receiver ) {
        System.out.println(receiver.getInfo());
    }
}

