package com.design_patterns;

import com.design_patterns.builder.Robot;
import com.design_patterns.builder.RobotAssembly;
import com.design_patterns.builder.RobotBuilder;
import com.design_patterns.builder.RobotEngineer;
import com.design_patterns.factory.Ship;
import com.design_patterns.factory.ShipFactory;
import com.design_patterns.strategy.Animal;
import com.design_patterns.strategy.Bird;
import com.design_patterns.strategy.Dog;

public class patterns {

    public void strategyPattern()
    {
        Animal doggy = new Dog("Moe", 22.2, 21.1);
        Animal bird = new Bird("joe", 22.2, 22.2);

        System.out.println(doggy.flyAnimal());
        System.out.println(bird.flyAnimal());
        System.out.println(doggy.getName() + " " + doggy.getHeight() + " " + doggy.getWeight());
        System.out.println(bird.getName() + " " + bird.getHeight() + " " + bird.getWeight());
    }

    public void factoryPattern()
    {
        ShipFactory shipFactory = new ShipFactory();

        Ship shipUfo = shipFactory.makeShip("UFO");
        System.out.println(shipUfo.getName());

        Ship shipRocket = shipFactory.makeShip("ROCKET");
        System.out.println(shipRocket.getName());
    }

    public void builderPattern()
    {
        RobotAssembly robotAssembly = new RobotAssembly();
        RobotEngineer robotEngineer = new RobotEngineer(robotAssembly);
        robotEngineer.makeRobot("plat_head", "plat_torso", "plat_arms", "plat_legs");

        Robot jackTheBot = robotEngineer.getRobot();
        System.out.println(jackTheBot.getRobotHead());
        System.out.println(jackTheBot.getRobotTorso());
        System.out.println(jackTheBot.getRobotArms());
        System.out.println(jackTheBot.getRobotLegs());

    }

}
