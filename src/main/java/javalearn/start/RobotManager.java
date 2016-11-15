package javalearn.start;

import javalearn.impl.poll.RobotPollCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        RobotPollCollection t1000Pool = (RobotPollCollection) context.getBean("t1000GoldenPool");
        t1000Pool.action();

    }

}
