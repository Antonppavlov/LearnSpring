package javalearn.impl.poll;

import javalearn.interfaces.IRobot;
import javalearn.interfaces.IRobotPollCollection;

import java.util.Collection;

public class RobotPollCollection implements IRobotPollCollection {

    private Collection<IRobot> robotCollection;

    public RobotPollCollection() {
    }

    public RobotPollCollection(Collection<IRobot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void action() {
        for (IRobot robot : robotCollection) {
            robot.action();
        }
    }


    @Override
    public Collection<IRobot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Collection<IRobot> robotCollection) {
        this.robotCollection = robotCollection;
    }
}
