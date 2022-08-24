package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Programmer " );
		/*
		 * we don't want to create object like new Student(12,"alam","Bandra"); 
		 * we want IoC will create object and inject them
		 * now with the following we are Instantiating a container
		 */       
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student=(Student) context.getBean("student1");
        System.out.println(student);
    }
}
