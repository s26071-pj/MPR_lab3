package pl.pjatk.henmud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentSecond {



    public ComponentSecond() {
        System.out.println("Hello, I am second component");
    }
    public void saysHi(){
        System.out.println("Second component says Hi");
    }
}
