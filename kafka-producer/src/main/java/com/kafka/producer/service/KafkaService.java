package com.kafka.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.producer.config.AppConstants;

@Service
public class KafkaService {
	private Logger logger = LoggerFactory.getLogger(KafkaService.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		logger.info("sending location update to kafka topic {}" , location);
		this.kafkaTemplate.send(AppConstants.Location_Topic_Name, location);
		return true;
		
	}
}
