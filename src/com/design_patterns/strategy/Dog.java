package com.design_patterns.strategy;

public class Dog extends Animal {
    public Dog(String name, double height, double weight)
    {
        super();
        setName(name);
        setHeight(height);
        setWeight(weight);
        flyingType = new ItCantFly();
    }

}
