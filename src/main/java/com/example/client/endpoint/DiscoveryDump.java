package com.example.client.endpoint;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryDump {
    
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/discoveries")
    public List<String> get() throws Exception {
        return discoveryClient.getServices();
    }
}
