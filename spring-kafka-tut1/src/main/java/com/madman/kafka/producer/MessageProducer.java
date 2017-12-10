package com.madman.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class MessageProducer {

	@Autowired
	private KafkaTemplate<String, String> template;

	public void publish(@RequestParam("topic") String topic, @RequestParam("msg") String message) {
		template.send(topic, message);
	}
}
