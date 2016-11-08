package javalearn.start;


import javalearn.interfaces.Hand;
import javalearn.interfaces.Head;
import javalearn.interfaces.Leg;

public class Robot {
    private final Hand hand;
    private final Head head;
    private final Leg leg;

    public Robot(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void action(){
        head.think();
        hand.take();
        leg.go();
    }
}
