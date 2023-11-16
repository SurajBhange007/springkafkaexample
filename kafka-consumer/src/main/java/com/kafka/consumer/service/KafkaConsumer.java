package com.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.consumer.config.AppConstants;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topics = AppConstants.Location_Topic_Name, groupId = AppConstants.Group_ID)
	public void updateLocation(String location) {
		
		System.out.println("Message recived : " + location);
	}
}
