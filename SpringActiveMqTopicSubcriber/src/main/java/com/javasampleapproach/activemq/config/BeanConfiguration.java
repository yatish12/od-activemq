package com.javasampleapproach.activemq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javasampleapproach.activemq.models.MessageStorage;

@Configuration
public class BeanConfiguration {

  @Bean
  public MessageStorage customerStorage() {
    return new MessageStorage();
  }
}
