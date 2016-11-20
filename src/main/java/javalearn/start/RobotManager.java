package javalearn.start;


import javalearn.interfaces.IRobot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        IRobot model1  = (IRobot) context.getBean("model1");
        model1.action();


        IRobot model2  = (IRobot) context.getBean("model2");
        model2.action();
    }

}
