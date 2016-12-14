package com.training.springExample.domain;

import java.io.FileInputStream;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springExample.bean.HelloBean;

public class Name {
//POJO to hold firstName & lastName
	public String firstName;
	public String lastName;
	public Name(){
		
	}
	public Name(String a,String b){
		this.firstName=a;
		this.lastName=b;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public static void main(String arg[]){
		//Object Instantiation
			Name name=new Name("first","last");
			System.out.println("Fisrt Name :"+name.getFirstName());
			System.out.println("Last Name :"+name.getLastName());
			name.setFirstName("Revathi");
			name.setLastName("S");
			System.out.println("Fisrt Name :"+name.getFirstName());
			System.out.println("Last Name :"+name.getLastName());
		//Dependency Injection
		//Load the name.xml to classpath
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
					new String[] { "name.xml" });	
		
		Name nameBean = (Name) appContext.getBean("nameBean");
		System.out.println("Fisrt Name :"+nameBean.getFirstName());
		System.out.println("Last Name :"+nameBean.getLastName());
		
		
	}

}
