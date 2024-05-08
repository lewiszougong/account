package com.demo.account.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/account")
@RequiredArgsConstructor
@Slf4j
public class AccountController {


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void retrieveAccounts() {

    }
}
