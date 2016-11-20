package javalearn.impl.sony;

import javalearn.interfaces.IHead;
import org.springframework.stereotype.Component;

@Component
public class SonyHead implements IHead {
    public void think(){
        System.out.println("Подумать как Sony");
    }
}
