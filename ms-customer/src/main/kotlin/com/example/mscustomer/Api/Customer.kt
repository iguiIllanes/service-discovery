package com.example.mscustomer.Api

import com.example.mscustomer.Dto.SecurityDto
import com.example.mscustomer.Service.SecurityClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/customer")
class Customer @Autowired constructor(
    private val securityClient: SecurityClient
){
    @Value("\${keycloak.client.id}")
    private lateinit var clientId: String

    @Value("\${keycloak.client.secret}")
    private lateinit var clientSecret: String

    @GetMapping("/test")
    fun test(): String {
        return "Hello, I'm Customer Service!"
    }

    @GetMapping("/token")
    fun token(): String {
        val params = SecurityDto(
            "client_credentials",
            clientId,
            clientSecret,
        )
        return securityClient.token(params)
    }
}