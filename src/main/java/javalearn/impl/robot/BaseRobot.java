package javalearn.impl.robot;

import javalearn.interfaces.IHand;
import javalearn.interfaces.IHead;
import javalearn.interfaces.IRobot;
import javalearn.interfaces.ILeg;

public abstract class BaseRobot implements IRobot {
    protected IHand IHand;
    protected IHead IHead;
    protected ILeg ILeg;

    public BaseRobot() {
        System.out.println(this + "-BaseRobot constuctor()");
    }

    public BaseRobot(IHand IHand, IHead IHead, ILeg ILeg) {
        this();
        this.IHand = IHand;
        this.IHead = IHead;
        this.ILeg = ILeg;
    }


    public IHand getIHand() {
        return IHand;
    }

    public void setIHand(IHand IHand) {
        this.IHand = IHand;
    }

    public IHead getIHead() {
        return IHead;
    }

    public void setIHead(IHead IHead) {
        this.IHead = IHead;
    }

    public ILeg getILeg() {
        return ILeg;
    }

    public void setILeg(ILeg ILeg) {
        this.ILeg = ILeg;
    }
}