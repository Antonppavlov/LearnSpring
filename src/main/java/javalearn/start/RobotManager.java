package javalearn.start;

import javalearn.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        ModelT1000 lgModelT1000 = (ModelT1000) context.getBean("t1000LG");
        lgModelT1000.action();
        lgModelT1000.dance();
    }

}
