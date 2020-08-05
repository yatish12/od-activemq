package com.javasampleapproach.activemq.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;


import org.springframework.stereotype.Component;


import com.javasampleapproach.activemq.models.Company;
import com.javasampleapproach.activemq.models.MessageStorage;
import com.javasampleapproach.activemq.models.Task;


@Component
public class JmsSubcriber {
	
	@Autowired
	private MessageStorage taskStorage;
	
	@JmsListener(destination = "${jsa.activemq.topic}")
	public void receive(Task task){
		System.out.println(task);
		taskStorage.add(task);
	}
}
