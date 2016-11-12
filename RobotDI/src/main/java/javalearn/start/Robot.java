package javalearn.start;


import javalearn.interfaces.Hand;
import javalearn.interfaces.Head;
import javalearn.interfaces.IRobot;
import javalearn.interfaces.Leg;

public class Robot implements IRobot {
    private  Hand hand;
    private  Head head;
    private  Leg leg;

    public Robot() {
    }

    public Robot(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    @Override
    public void action(){
        head.think();
        hand.take();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("Робот танцует");
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
