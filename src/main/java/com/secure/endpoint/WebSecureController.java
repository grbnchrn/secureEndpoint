package com.secure.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSecureController {

    @GetMapping("/get")
    public String getData(){
        return "Secure Endpoint";
    }
}
