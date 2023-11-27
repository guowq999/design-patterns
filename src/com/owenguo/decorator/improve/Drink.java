package com.owenguo.decorator.improve;

public abstract class Drink {

    private String desc;
    private Double price = 0.00;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract Double cost();
}
