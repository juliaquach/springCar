package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main (String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        //Using the decapitalised class name "car"
//        Vehicle obj = (Vehicle)context.getBean("car");
//        obj.drive();

//        Tyre t = (Tyre)context.getBean("tyre");
//        System.out.println(t);

Car obj = (Car)context.getBean("car");
        System.out.println(obj);

    }
}
