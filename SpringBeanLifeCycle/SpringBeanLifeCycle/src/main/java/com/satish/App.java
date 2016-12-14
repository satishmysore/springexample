package com.satish;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satish.springbean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext  context =
                new ClassPathXmlApplicationContext("resources/Spring-Module-Lifecycle.xml");
    	
    	HelloWorld obj = (HelloWorld) context.getBean("helloworld");
    	obj.getMessage();
        context.registerShutdownHook();
    }
}
