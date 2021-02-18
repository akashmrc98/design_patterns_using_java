package com.design_patterns.strategy;

interface Fly{
    String fly();
}

class ItFly implements Fly {
    @Override
    public String fly() {
        return "I Can Fly :)";
    }
}

class ItCantFly implements  Fly{
    @Override
    public String fly() {
        return "I Cant Fly :(";
    }
}
