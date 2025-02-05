package com.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = KafkaConstant.LOCATION_UPDATE_TOPIC, groupId = KafkaConstant.GROUP_ID)
    public void updateLocation(String location) {
        System.out.println("location update " +location);
    }
}
