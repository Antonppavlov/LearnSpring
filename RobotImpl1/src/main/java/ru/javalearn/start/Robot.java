package ru.javalearn.start;

import ru.javalearn.object.SonyHand;
import ru.javalearn.object.SonyHead;
import ru.javalearn.object.SonyLeg;

public class Robot {
    private SonyHand sonyHand =new SonyHand();
    private SonyHead sonyHead = new SonyHead();
    private SonyLeg sonyLeg = new SonyLeg();

    public void actrion(){
        sonyHead.think();
        sonyHand.take();
        sonyLeg.go();
    }
}
