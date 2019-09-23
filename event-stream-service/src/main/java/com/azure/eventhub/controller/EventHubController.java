package com.azure.eventhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventHubController {

    @GetMapping("/event")
    public String test(@RequestHeader("X-second-Header") String headerValue){
        return headerValue;
    }

}
