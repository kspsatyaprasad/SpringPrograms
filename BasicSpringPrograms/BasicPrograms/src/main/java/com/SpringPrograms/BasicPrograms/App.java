package com.SpringPrograms.BasicPrograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//we can also BeanFactory which is subset of ApplicationContext
//    	Vehicle obj = (Vehicle)context.getBean("bike"); //gives the object of the available class
//      obj.drive();
     	Tyre t = (Tyre)context.getBean("tyre"); 
        System.out.println(t);
    }
}
