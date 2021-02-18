package com.design_patterns.strategy;

public class Bird extends Animal {
    public Bird(String name, double height, double weight)
    {
        super();
        setName(name);
        setHeight(height);
        setWeight(weight);
        flyingType = new ItFly();
    }

}
