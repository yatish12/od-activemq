package com.grokonez.activemq.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.activemq.jms.consumer.JmsConsumer;
import com.grokonez.activemq.jms.producer.JmsProducer;
import com.grokonez.activemq.model.MessageStorage;
import com.grokonez.activemq.model.Task;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RestAPIs {
	
	@Autowired
	JmsProducer jmsProducer;
	
	@Autowired
	private MessageStorage taskStorage;
	
	@PostMapping(value="/api/task")
	public Task postCustomer(@RequestBody Task task){
		jmsProducer.send(task);
		return task;
	}
	
	@GetMapping(value="/api/tasks")
	public List<Task> getAll(){
		List<Task> tasks = new ArrayList<Task>(taskStorage.getAll());
		taskStorage.clear();
		return tasks;
	}
}
