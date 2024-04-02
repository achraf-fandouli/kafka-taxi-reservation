package com.digitalcode.kafka.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalcode.kafka.service.TaxiLocationService;

@RestController
@RequestMapping("/location")
public class TaxiLocationController {

    @Autowired
    private TaxiLocationService cabLocationService;

    @PostMapping("")
    public ResponseEntity updateLocation() throws InterruptedException {

        int range=100;
        while(range>0){
            //mock data
            cabLocationService.updateLocation(Math.random()+" , "+Math.random());
            // creating a delay in pushing  so that location get pushed to kafka in every second
            Thread.sleep(1000);
            range--;
        }

        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }


}