package org.example.classbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appcontext = new AnnotationConfigApplicationContext(BeanConf.class);


        People people = appcontext.getBean(People.class);
        Bike bike = appcontext.getBean(Bike.class);
        Auto auto = appcontext.getBean(Auto.class);
        System.out.println(people.toString());
        System.out.println(bike.toString());
        System.out.println(auto.toString());

    }
}
