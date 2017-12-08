package com.madman.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madman.kafka.producer.MessageProducer;

@RestController
@RequestMapping(value = "/kafka/pub")
public class KafkaController {
	
	@Autowired
	private MessageProducer producer;

	@RequestMapping()
	public void publishEvent(@RequestParam("topic") String topic, @RequestParam("msg") String message) {
		producer.publish(topic, message);
	}
}
