package javalearn.start;

import javalearn.robot.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        Robot lgRobot = (Robot) context.getBean("t1000");
        lgRobot.action();
    }

}
