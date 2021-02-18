package com.design_patterns.strategy;

public class Animal {
    private String name;
    private double height;
    private double weight;

    private String food;
    private double speed;
    private String  sound;

    // Strategy Pattern
    public Fly flyingType;
    public String flyAnimal(){
        return flyingType.fly();
    }


    public void setName(String newName){ name = newName; }
    public String getName(){return name;}

    public void setHeight(double newHeight){ height = newHeight; }
    public double getHeight(){return height;}

    public void setWeight(double newWeight){ weight = newWeight; }
    public double getWeight(){return weight;}

    public void setFood(String newFood){ food = newFood; }
    public String getFood(){return food;}

    public void setSpeed(double newSpeed){ speed = newSpeed; }
    public double getSpeed(){return speed;}

    public void setSound(String  newSound){ sound = newSound; }
    public String  getSound(){return sound;}
}
