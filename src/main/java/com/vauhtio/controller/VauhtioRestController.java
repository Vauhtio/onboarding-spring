package com.vauhtio.controller;


import com.vauhtio.bo.VauhtioData;
import org.springframework.web.bind.annotation.*;

@RestController
public class VauhtioRestController {
    
    @RequestMapping("/")
    public String basicGet() {
        return "Response from VauhtioRestController";
    }

    @GetMapping("/getwithpath/{index}")
    public String getDataWithUrlPath (@PathVariable String index) {
        return "getDataWithUrlPath, index was " + index;
    }

    @GetMapping("/getwithparam")
    public String getDataWithGetParam (@RequestParam String index) {
        return "getDataWithGetParam, index was " + index;
    }

    @PostMapping("/postdata")
    public String postData (@RequestBody VauhtioData vauhtioData) {
        return vauhtioData.toString();
    }
}
