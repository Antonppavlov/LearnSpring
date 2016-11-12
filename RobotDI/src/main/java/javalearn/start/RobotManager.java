package javalearn.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationIoC.xml");
        Robot lgRobot = (Robot) context.getBean("lgRobot");
        lgRobot.action();
        System.out.println();
        Robot sonyRobot = (Robot) context.getBean("sonyRobot");
        sonyRobot.action();
    }

}
