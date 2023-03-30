package com.example.msaccount.Service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("ms-customer")
interface CustomerClient {
    @GetMapping("/api/v1/customer/test")
    fun test(): String

    @GetMapping("/api/v1/customer/token")
    fun token(): String
}