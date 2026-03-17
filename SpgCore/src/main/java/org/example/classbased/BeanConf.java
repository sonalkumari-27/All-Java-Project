package org.example.classbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration //Declares the class as conf class and called class based conf
@ComponentScan(basePackages = "org.example.classbased")  //Scans all the classes annotated with @component inside the package
public class BeanConf {

    //For getting a bean of inbuilt class
    @Bean
    public List<Integer> listProvider(){
        return List.of(1,2,1,3);
    }

    @Bean(name = "yamaha")
    public Bike bikeProvider(){
        Bike b = new Bike();
        b.setBikeId(12);
        b.setBikeName("Yamaha");
        b.setBikeColor("red");

        return b;
    }
}
