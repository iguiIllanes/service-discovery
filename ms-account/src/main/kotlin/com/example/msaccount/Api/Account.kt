package com.example.msaccount.Api

import com.example.msaccount.Service.CustomerClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/account")
class Account @Autowired constructor(
    private val customerClient: CustomerClient
) {
    @GetMapping("/test")
    fun test(): String {
        return customerClient.test()
    }

    @GetMapping("/token")
    fun token(): String {
        return customerClient.token()
    }
}