package com.example.mscustomer.Service

import com.example.mscustomer.Dto.SecurityDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import javax.ws.rs.core.MediaType

@FeignClient(name = "ms-security", url = "http://localhost:8081/realms/ms-practica2703/protocol/openid-connect")
interface SecurityClient {
    @PostMapping("/token", consumes = arrayOf(MediaType.APPLICATION_FORM_URLENCODED))
    fun token(
        securityDto: SecurityDto
    ): String
}