package com.owenguo.flyweight;

public class Client {
    public static void main(String[] args) {
        // 创建一个工厂类
        WebsiteFactory factory = new WebsiteFactory();

        // 客户要一个以新闻形式展示的网站
        Website website1 = factory.getWebsiteCategory("新闻");
        website1.use(new User("张三"));

        Website website2 = factory.getWebsiteCategory("新闻");
        website2.use(new User("李四"));

        Website website3 = factory.getWebsiteCategory("博客");
        website3.use(new User("李四"));

        Website website4 = factory.getWebsiteCategory("微信公众号");
        website4.use(new User("李四"));

        System.out.println("网站实例数量:" + factory.getWebsiteCount());
    }
}
