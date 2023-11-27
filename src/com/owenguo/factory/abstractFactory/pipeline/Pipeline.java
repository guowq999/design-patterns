package com.owenguo.factory.abstractFactory.pipeline;

import com.owenguo.factory.abstractFactory.pizza.Pizza;

public abstract class Pipeline {
    public abstract Pizza makePizza(String taste);
}
