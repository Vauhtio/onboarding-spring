package com.vauhtio.controller;


import com.vauhtio.bo.VauhtioData;
import org.springframework.web.bind.annotation.*;

@RestController
public class VauhtioRestController {

    /**
     * Endpoint for plain HTTP GET without any parameters
     * No HTTP Basic authentication expected
     *
     * http://localhost:8080/
     */
    @RequestMapping("/")
    public String basicGet() {
        return "Response from VauhtioRestController";
    }

    /**
     * Emdpoint for HTTP GET with URL path parameter
     * No HTTP Basic authentication expected
     *
     * http://localhost:8080/getwithpath/somedatahere
     *
     * @param index
     */
    @GetMapping("/getwithpath/{index}")
    public String getDataWithUrlPath (@PathVariable String index) {
        return "getDataWithUrlPath, index was " + index;
    }

    /**
     * Endpoint for HTTP GET with request parameter
     * No HTTP Basic authentication expected
     *
     * http://localhost:8080/getwithparam?index=somedatahere
     *
     * @param index
     */
    @GetMapping("/getwithparam")
    public String getDataWithGetParam (@RequestParam String index) {
        return "getDataWithGetParam, index was " + index;
    }

    /**
     * Endpoint for HTTP POST with Json object in request body
     * No HTTP Basic authentication expected
     *
     * http://ocalhost:8080/postdata
     *
     * @param vauhtioData
     */
    @PostMapping("/postdata")
    public String postData (@RequestBody VauhtioData vauhtioData) {
        return vauhtioData.toString();
    }

    /**
     * Endpoint for HTTP GET sensitive information
     * HTTP Basic authentication IS expected
     *
     * http://localhost:8080/secure/sensitive
     */
    @GetMapping("/secure/sensitive")
    public String getDataWithGetParam () {
        return "sensitive information";
    }
}
