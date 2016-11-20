package javalearn.impl.sony;

import javalearn.interfaces.ILeg;
import org.springframework.stereotype.Component;

@Component
public class SonyLeg implements ILeg {
    public void go(){
        System.out.println("Идти как Sony");
    }
}
