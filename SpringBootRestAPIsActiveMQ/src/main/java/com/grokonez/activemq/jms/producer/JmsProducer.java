package com.grokonez.activemq.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.grokonez.activemq.model.Task;

@Component
public class JmsProducer {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${gkz.activemq.queue}")
	String queue;
	
	public void send(Task task){
		jmsTemplate.convertAndSend(queue, task);
	}
}