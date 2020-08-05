package com.javasampleapproach.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.activemq.jms.JmsPublisher;
import com.javasampleapproach.activemq.models.Task;

@RestController
public class RestAPI {
	
	@Autowired
	JmsPublisher jmsPublisher;
	
	// @Autowired
	// private MessageStorage taskStorage;
	
	@PostMapping(value="/api/task")
	public Task postCustomer(@RequestBody Task task){
		jmsPublisher.send(task);
		return task;
	}

}
