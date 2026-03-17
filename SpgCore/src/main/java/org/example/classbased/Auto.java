package org.example.classbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Auto {

    @Autowired
    private People people;

    @Autowired
    private Bike bike;


    @Override
    public String toString() {
        return "Auto{" +
                "people=" + people +
                ", bike=" + bike +
                '}';
    }

}
