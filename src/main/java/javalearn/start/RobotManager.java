package javalearn.start;

import javalearn.impl.poll.RobotPollMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        RobotPollMap t1000Pool = (RobotPollMap) context.getBean("t1000Pool2");
        t1000Pool.action();

    }

}
