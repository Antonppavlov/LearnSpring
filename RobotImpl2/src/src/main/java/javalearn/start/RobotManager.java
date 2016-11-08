package javalearn.start;

import javalearn.lg.LgHead;
import javalearn.sony.SonyHand;
import javalearn.sony.SonyLeg;

public class RobotManager {
    public static void main(String[] args) {
        Robot robot =
                new Robot(
                        new SonyHand(),
                        new LgHead(),
                        new SonyLeg());
        robot.action();
    }

}
