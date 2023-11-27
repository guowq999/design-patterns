package com.owenguo.template;

public class Client {
    public static void main(String[] args) {
        // 制作红豆豆浆
        SoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();

        // 制作花生豆浆
        SoyaMilk pennutSoyaMilk = new PennutSoyaMilk();
        pennutSoyaMilk.make();
    }
}
