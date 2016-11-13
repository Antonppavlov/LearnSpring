package javalearn.start;

import javalearn.interfaces.IRobot;
import javalearn.interfaces.IRobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        IRobotConveyor robotConveyor = (IRobotConveyor) context.getBean("robotConveyor");
        IRobot lgModelT1000_1 = robotConveyor.createRobot();
        IRobot lgModelT1000_2 = robotConveyor.createRobot();
        IRobot lgModelT1000_3 = robotConveyor.createRobot();
        System.out.println(lgModelT1000_1);
        lgModelT1000_1.action();
        System.out.println(lgModelT1000_2);
        lgModelT1000_2.action();
        System.out.println(lgModelT1000_3);
        lgModelT1000_3.action();
    }

}
