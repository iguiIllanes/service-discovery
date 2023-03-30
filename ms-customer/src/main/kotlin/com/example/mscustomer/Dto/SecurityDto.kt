package com.example.mscustomer.Dto

import feign.form.FormProperty

class SecurityDto constructor(
    val grantType: String,
    val clientId: String,
    val clientSecret: String
) {
    @FormProperty("grant_type")
    var grant_type: String = grantType

    @FormProperty("client_id")
    var client_id: String = clientId

    @FormProperty("client_secret")
    var client_secret: String = clientSecret
}