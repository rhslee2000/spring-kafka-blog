package com.madman.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class GreetingsTopicListener {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@KafkaListener(topics = "greetings")
	public void listen(ConsumerRecord<?,?> cr) throws Exception {
		logger.info(cr.toString());
	}
}
