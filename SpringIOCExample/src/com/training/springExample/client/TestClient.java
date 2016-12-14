package com.training.springExample.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springExample.bean.HelloBean;
import com.training.springExample.domain.Name;

public class TestClient {
	public static void main(String[] args) {
		try {
			System.out.println("TestClient started");

			//Load the hello.xml to classpath
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
					new String[] { "hello.xml" });

			System.out.println("Classpath loaded");

			HelloBean helloBean = (HelloBean) appContext.getBean("helloBean");

			Name name = new Name();
			name.setFirstName("Tony");
			name.setLastName("Greg");
			
			ClassPathXmlApplicationContext appContext1 = new ClassPathXmlApplicationContext(
					new String[] { "name.xml" });	
			Name nameBean = (Name) appContext1.getBean("nameBean");
			String str = helloBean.wishMe(nameBean);
			
			System.out.println(str);
			
            String str1 = helloBean.wishMe(name);
			
			System.out.println(str1);
			System.out.println("TestClient end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
