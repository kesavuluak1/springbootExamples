package com.java4s.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJava4sController {

    @RequestMapping("/userlogin")
    public String userValidation() {
        return "User: Successfully logged in!";

    }

    @RequestMapping("/adminlogin")
    public String adminValidation() {
        return "Admin: Successfully logged in!";

    }

}