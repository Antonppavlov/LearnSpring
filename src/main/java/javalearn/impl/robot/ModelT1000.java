package javalearn.impl.robot;


import javalearn.interfaces.IHand;
import javalearn.interfaces.IHead;
import javalearn.interfaces.ILeg;

public class ModelT1000 extends BaseRobot  {

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(IHand IHand, IHead IHead, ILeg ILeg) {
        super(IHand, IHead, ILeg);
    }

    public ModelT1000(IHand IHand, IHead IHead, ILeg ILeg,
                      String color, int year, boolean soundEnabled) {

        this(IHand, IHead, ILeg);

        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {
        IHead.think();
        IHand.take();
        ILeg.go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("isSoundEnabled: " + isSoundEnabled());
        System.out.println("");
    }

    @Override
    public void dance() {
        System.out.println("Робот танцует");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
