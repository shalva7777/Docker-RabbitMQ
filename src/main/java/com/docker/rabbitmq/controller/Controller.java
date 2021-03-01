package com.docker.rabbitmq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class Controller {

    @GetMapping(value = "/test")
    // @ResponseStatus annotation marks the method with the status-code and the reason message that should be returned.
    public String send(@PathVariable("msg") final String message) {
        return "Message sent successfully to the queue.";
    }
}
