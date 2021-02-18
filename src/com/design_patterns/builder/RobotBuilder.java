package com.design_patterns.builder;

public interface RobotBuilder {
    public void buildRobotHead(String head);
    public void buildRobotTorso(String torso);
    public void buildRobotArms(String arms);
    public void buildRobotLegs(String legs);
    public Robot getRobot();
}
