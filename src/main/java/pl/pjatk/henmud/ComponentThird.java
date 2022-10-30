package pl.pjatk.henmud;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ComponentThird {
   ApplicationContext applicationContext;

    public ComponentThird(ApplicationContext applicationContext) {
        System.out.println("Hello, I am third component");
    this.applicationContext = applicationContext;

   ComponentFirst first =  applicationContext.getBean("componentFirst", ComponentFirst.class);
   ComponentSecond second =  applicationContext.getBean("componentSecond", ComponentSecond.class);

   first.sayHI();
   second.saysHi();
    }
}
