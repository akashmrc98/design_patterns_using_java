package com.design_patterns.factory;

public class ShipFactory {

    public Ship makeShip(String newShipType) {

        Ship newShip = null;

        if (newShipType.equals("UFO"))
            return new Ufo("UFO Ship Dragon", 22);

        if (newShipType.equals("ROCKET"))
            return new Rocket("ROCKET Ship Rox", 22);

        return null;
    }
}
