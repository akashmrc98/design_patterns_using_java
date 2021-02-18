package com.design_patterns.builder;

public class RobotAssembly implements RobotBuilder {

    public Robot robot;
    public RobotAssembly() { this.robot = new Robot(); }

    @Override
    public void buildRobotHead(String head) { this.robot.setRobotHead(head); }
    @Override
    public void buildRobotTorso(String torso) { this.robot.setRobotTorso(torso);}
    @Override
    public void buildRobotArms(String arms) { this.robot.setRobotArms(arms);}
    @Override
    public void buildRobotLegs(String legs) { this.robot.setRobotLegs(legs);}
    @Override
    public Robot getRobot() { return this.robot;}
}
