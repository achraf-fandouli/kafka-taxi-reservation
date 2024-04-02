package com.digitalcode.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "taxi-location",groupId = "user-group")
    public void TaxiLocation(String location){

        System.out.println(location);

    }
}