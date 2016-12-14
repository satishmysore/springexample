package com.satish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satish.springbean.HelloIndia;
import com.satish.springbean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext  context =
                new ClassPathXmlApplicationContext("resources/Spring-Module-BeanDefinitionInheritance.xml");
    	
    	ApplicationContext  context1 =
                new ClassPathXmlApplicationContext("resources/Spring-Module-BeanDefinitionInheritance-Template.xml");
    	
    	
    	HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
    	helloWorld.getMessage1();
    	helloWorld.getMessage2();
    	
    	HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
    	helloIndia.getMessage1();
    	helloIndia.getMessage2();
    	helloIndia.getMessage3();
    	helloIndia.getMessage4();
    	
    	
    	HelloIndia helloIndia1 = (HelloIndia) context1.getBean("helloIndia");
    	helloIndia1.getMessage1();
    	helloIndia1.getMessage2();
    	helloIndia1.getMessage3();
    }
}
