package com.design_patterns.factory;

public class Ship {

    private String name;
    private double damageRate;

    public String getName() {return this.name;}
    public void setName(String name) {this.name =name;}

    public double getDamage() {return this.damageRate;}
    public void setDamage(double damageRate) { this.damageRate = damageRate; }

    public void attack(){
        System.out.println(this.damageRate + "%");
    }

}
