package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//The @Component is the same as writing the bean line in the spring.xml file
//After using the @Component you can directly use the class name "com.company.Car", but decapitalised --> "car"

@Component
public class Car implements Vehicle {

    @Autowired
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive(){
        System.out.println("I am driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyre=" + tyre +
                '}';
    }
}
