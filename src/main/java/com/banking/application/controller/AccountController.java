package com.banking.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/account-statement")
    public String accountStatement() {
        return "account-statement";
    }
}
