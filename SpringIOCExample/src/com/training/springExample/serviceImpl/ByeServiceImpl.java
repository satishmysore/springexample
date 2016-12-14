package com.training.springExample.serviceImpl;

import com.training.springExample.domain.Name;
import com.training.springExample.service.ByeService;

public class ByeServiceImpl implements ByeService {

	public String sayBye(Name name) {
		return "Bye " + name.getFirstName() + " " + name.getLastName();
	}

}
