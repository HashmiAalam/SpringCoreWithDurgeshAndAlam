package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello programmer in spring framework!
 * I am a spring framework and will do lots of stuff for you.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Programmer in spring framework!" );
        /*java without spring:- tightly coupled*/ 
        Student student1=new Student();
        student1.setRollNo(21);
        student1.setName("Wakeel");
        student1.setAddress("Sakinaka");
        System.out.println(student1);
		/*
		 * we don't want to create object like new Student(12,"alam","Bandra"); 
		 * we want IoC will create object and inject them
		 * now with the following we are Instantiating a container
		 */ 
        /*
		 * java with spring:- loosely coupled
		 * instantiating the spring IoC container which give data required
		 */ 
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student=(Student) context.getBean("student1");
        System.out.println(student);
    }
}
