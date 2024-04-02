package com.digitalcode.kafka.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.digitalcode.kafka.common.Constant;
import com.digitalcode.kafka.service.TaxiLocationService;

@Service
public class TaxiLocationServiceImpl implements TaxiLocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @Override
    public boolean updateLocation(String location){

        // This is where we push our data to kafka --> PRODUCER
        kafkaTemplate.send(Constant.TAXI_LOCATION,location);
        return true;

    }


}