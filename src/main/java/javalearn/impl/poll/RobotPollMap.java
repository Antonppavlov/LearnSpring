package javalearn.impl.poll;

import javalearn.interfaces.IRobot;
import javalearn.interfaces.IRobotPollMap;

import java.util.Map;

public class RobotPollMap implements IRobotPollMap {

    private Map<Integer, IRobot> robotMap;

    public RobotPollMap() {
    }

    public RobotPollMap(Map<Integer, IRobot> robotMap) {
        this.robotMap = robotMap;
    }

    public void action() {
       for(Map.Entry<Integer, IRobot> robot : robotMap.entrySet()){
           System.out.println(robot.getKey().toString());
           robot.getValue().action();
       }
    }

    @Override
    public Map<Integer, IRobot> getRobotMap() {
        return robotMap;
    }

    public void setRobotMap(Map<Integer, IRobot> robotMap) {
        this.robotMap = robotMap;
    }

}
