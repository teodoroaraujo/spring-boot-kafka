package com.demo.kafka.controller;


import com.demo.kafka.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private Sender sender;

    @GetMapping()
    public ResponseEntity<String> send() {
        sender.send("Spring Kafka Producer and Consumer Example");
        return ResponseEntity.ok().body("");
    }
}
