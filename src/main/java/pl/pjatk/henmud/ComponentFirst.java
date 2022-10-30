package pl.pjatk.henmud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentFirst {

    @Autowired
    private ComponentSecond componentSecond;

    public ComponentFirst(){
        System.out.println("Hello, I am first component");

    }

    public ComponentSecond getComponentSecond() {
        return componentSecond;
    }

    public void setComponentSecond(ComponentSecond componentSecond) {
        this.componentSecond = componentSecond;
    }


    public void sayHI(){
        System.out.println("First component says HI :) ");
    }
}
