package javalearn.robot;


import javalearn.interfaces.Hand;
import javalearn.interfaces.Head;
import javalearn.interfaces.Leg;

public class ModelT1000 extends BaseRobot  {

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        super(hand, head, leg);
    }

    public ModelT1000(Hand hand, Head head, Leg leg,
                      String color, int year, boolean soundEnabled) {

        this(hand, head, leg);

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
        head.think();
        hand.take();
        leg.go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("isSoundEnabled: " + isSoundEnabled());
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
