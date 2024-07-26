package com.Backend.urbaneswim.controller.authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {

    @RequestMapping("/login")
    public String sayHello() {
        return "welcome to login page";
    }

}
