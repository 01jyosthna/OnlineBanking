package com.banking.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasswordController {

    @GetMapping("/change-password")
    public String changePassword() {
        return "change-password";
    }
}
