
# Kafka with Spring Boot

Example of taxi reservation app
When a user go to taxi reservation app and book a taxi then a driver is assigned to that particular user, now that user is getting constant location update of the driver.


## Steps to setup kafka:

● Goto: https://kafka.apache.org/quickstart

● Download kafka like this kafka_2.13–3.7.0.tgz

● Unzip this file in your C- drive

● Install java 8 or 8+ version in your Local machine (if you have it then skip this step)

● Now go to this folder like this kafka_2.13–3.7.0 in your C-drive and then goto Bin folder then window(If you are using window only)

● Open this path in your Command Prompt it looks like this C:\kafka_2.13–3.7.0\bin\windows>

## Start the zookeeper

    zookeeper-server-start.bat ..\..\config\zookeeper.properties

## Start the kafka: 

    kafka-server-start.bat ..\..\config\server.properties

## Run the producer : kafkaReservationDriver

After that, build and run the producer(kafkaReservationDriver) project

## run the consumer: kafkaReservationUser
After that, build and run the consumer(kafkaReservationUser) project

## Invoke the API /location:

    http://localhost:9091/location

![image](https://github.com/achraf-fandouli/kafka-taxi-reservation/assets/55927202/1d5313b7-4ce8-47cc-a83b-b11e25ad36f4)

<img width="281" alt="image" src="https://github.com/achraf-fandouli/kafka-taxi-reservation/assets/55927202/3651d588-cb5b-4d56-baf0-1dc605136a57">
