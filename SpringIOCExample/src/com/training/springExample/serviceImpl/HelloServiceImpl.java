package com.training.springExample.serviceImpl;

import com.training.springExample.domain.Name;
import com.training.springExample.service.HelloService;

public class HelloServiceImpl implements HelloService {

	public String sayHello(Name name) {

		return "Hello  " + name.getFirstName() + " " + name.getLastName();
	}

}
