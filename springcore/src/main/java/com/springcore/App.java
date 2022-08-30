package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * values as attribute in config.xml
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
		 * java with spring:- loosely coupled
		 * instantiating the spring IoC container which give data required
		 */ 
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student0=(Student) context.getBean("student0");
        Student student=(Student) context.getBean("student1");
        Student student2=(Student) context.getBean("student2");
        System.out.println(student0);
        System.out.println(student);
        System.out.println(student2);
    }
}
