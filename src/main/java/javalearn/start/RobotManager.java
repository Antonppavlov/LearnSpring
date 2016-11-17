package javalearn.start;


import javalearn.interfaces.IRobot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        IRobot t1000  = (IRobot) context.getBean("t1000");
        t1000.action();

    }

}
