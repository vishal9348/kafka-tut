package com.deliveryboy.service;

import com.deliveryboy.config.KafkaConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location) {
        this.kafkaTemplate.send(KafkaConstant.LOCATION_UPDATE_TOPIC, location);
        return true;
    }
}
