package com.example.sesservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AccountController {
    private AccountDB accountDB;

    public AccountController(AccountDB accountDB) {
        this.accountDB = accountDB;
    }

    @PostMapping("/accounts")
    public void createAccount(AccountRequest accountRequest) {
        var account = new Account(accountRequest.name(), UUID.randomUUID());

    }
}
