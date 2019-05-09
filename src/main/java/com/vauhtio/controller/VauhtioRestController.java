package com.vauhtio.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VauhtioRestController {
    
    @RequestMapping("/")
    public String basicGet() {
        return "Response from VauhtioRestController";
    }

    @GetMapping("/getwithpath/{index}")
    public String getData (@PathVariable String index) {
        return "vauhtio data, index was " + index;
    }
}
