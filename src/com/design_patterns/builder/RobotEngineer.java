package com.design_patterns.builder;

public class RobotEngineer {
    private RobotAssembly robotAssembly;

    public RobotEngineer(RobotAssembly robotAssembly)
    {
        this.robotAssembly = robotAssembly;
    }

    public Robot getRobot()
    {
        return this.robotAssembly.getRobot();
    }

    public void makeRobot(String head, String torso, String arms, String legs)
    {
        this.robotAssembly.buildRobotHead(head);
        this.robotAssembly.buildRobotTorso(torso);
        this.robotAssembly.buildRobotArms(arms);
        this.robotAssembly.buildRobotLegs(legs);
    }

}
