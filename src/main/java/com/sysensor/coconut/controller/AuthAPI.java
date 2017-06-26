package com.sysensor.coconut.controller;

import com.sysensor.coconut.config.URLConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URLConfig.AUTHENTICATE)
public class AuthAPI {

    @GetMapping()
    public boolean authenticate() {
        return true;
    }

}
