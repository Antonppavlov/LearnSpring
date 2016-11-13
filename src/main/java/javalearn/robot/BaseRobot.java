package javalearn.robot;

import javalearn.interfaces.Hand;
import javalearn.interfaces.Head;
import javalearn.interfaces.IRobot;
import javalearn.interfaces.Leg;

public abstract class BaseRobot implements IRobot {
    protected Hand hand;
    protected Head head;
    protected Leg leg;

    public BaseRobot() {
        System.out.println(this + "-BaseRobot constuctor()");
    }

    public BaseRobot(Hand hand, Head head, Leg leg) {
        this();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }


    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}