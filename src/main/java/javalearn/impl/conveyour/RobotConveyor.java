package javalearn.impl.conveyour;

import javalearn.interfaces.IRobot;
import javalearn.interfaces.IRobotConveyor;

public abstract class RobotConveyor implements IRobotConveyor {

    @Override
    public abstract IRobot createRobot();
}
