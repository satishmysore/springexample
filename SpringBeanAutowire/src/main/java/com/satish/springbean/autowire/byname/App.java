package com.satish.springbean.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satish.springbean.beans.EmployeeBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
                new ClassPathXmlApplicationContext("resources/Spring-Module-byName.xml");
         
      EmployeeBean employee = (EmployeeBean)context.getBean("employee");
      System.out.println(employee.getFullName());
      System.out.println(employee.getDepartmentBean().getName());
    }
}
