package com.javasampleapproach.activemq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javasampleapproach.activemq.jms.JmsPublisher;
import com.javasampleapproach.activemq.models.Company;
import com.javasampleapproach.activemq.models.Product;

@SpringBootApplication
public class SpringActiveMqTopicProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActiveMqTopicProducerApplication.class, args);
		
	}
}
