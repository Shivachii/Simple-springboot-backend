package com.Backend.urbaneswim.controller.authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RegisterController {

    @RequestMapping("/register")
    public String sayHello() {
        return "welcome to registration page";
    }

}
