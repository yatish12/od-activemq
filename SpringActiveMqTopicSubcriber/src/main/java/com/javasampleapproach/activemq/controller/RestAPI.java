package com.javasampleapproach.activemq.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.activemq.models.MessageStorage;
import com.javasampleapproach.activemq.models.Task;

@RestController
public class RestAPI {
	
	@Autowired
	private MessageStorage taskStorage;
	
	@GetMapping(value="/api/tasks")
	public List<Task> getAll(){
		List<Task> tasks = new ArrayList<Task>(taskStorage.getAll());
		taskStorage.clear();
		return tasks;
	}

}
