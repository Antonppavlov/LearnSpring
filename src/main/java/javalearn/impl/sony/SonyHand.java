package javalearn.impl.sony;

import javalearn.interfaces.IHand;
import org.springframework.stereotype.Component;

@Component
public class SonyHand  implements IHand {
    public void take(){
        System.out.println("Взять как Sony");
    }
}
