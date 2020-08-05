package com.grokonez.activemq.jms.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.grokonez.activemq.model.MessageStorage;
import com.grokonez.activemq.model.Task;

@Component
public class JmsConsumer {
	@Autowired
	private MessageStorage taskStorage;
	
	// @JmsListener(destination = "${gkz.activemq.queue}", containerFactory="jsaFactory")
	@JmsListener(destination = "${gkz.activemq.queue}")
	public void receive(Task task){
		System.out.println(task);
		taskStorage.add(task);
	}
}