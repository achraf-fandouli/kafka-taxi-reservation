package com.digitalcode.kafka.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.digitalcode.kafka.common.Constant;

@Configuration
public class KafkaConfig {



    @Bean
    public NewTopic topic(){

        return TopicBuilder.name(Constant.TAXI_LOCATION).build();
    }

}