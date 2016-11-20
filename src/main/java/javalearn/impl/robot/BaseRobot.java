package javalearn.impl.robot;

import javalearn.interfaces.IHand;
import javalearn.interfaces.IHead;
import javalearn.interfaces.ILeg;
import javalearn.interfaces.IRobot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BaseRobot implements IRobot {
    @Autowired
    protected IHand IHand;
    @Autowired
    protected IHead IHead;
    @Autowired
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

    public javalearn.interfaces.IHand getIHand() {
        return IHand;
    }

    //@Required
    public void setIHand(javalearn.interfaces.IHand IHand) {
        this.IHand = IHand;
    }

    public javalearn.interfaces.IHead getIHead() {
        return IHead;
    }

    //@Required
    public void setIHead(javalearn.interfaces.IHead IHead) {
        this.IHead = IHead;
    }

    public javalearn.interfaces.ILeg getILeg() {
        return ILeg;
    }

    //@Required
    public void setILeg(javalearn.interfaces.ILeg ILeg) {
        this.ILeg = ILeg;
    }
}