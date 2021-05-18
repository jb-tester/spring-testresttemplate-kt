package com.mytests.spring.springtestresttemplatekt

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpMethod

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringTestRestTemplateKtApplicationTests//(@Autowired val restTemplate: TestRestTemplate)
{
    @Autowired
    private val restTemplate: TestRestTemplate? = null

    @Test
    fun test1() {
        val response = restTemplate!!.exchange("/hello", HttpMethod.GET, null, String::class.java)
        println(response.body)
        Assertions.assertThat(response.body).contains("How are you?")
    }
    @Test
    fun test2() {
        val response = restTemplate!!.getForEntity("/bye", String::class.java)
        println(response.body)
        Assertions.assertThat(response.body).contains("Have a nice day!")
    }
}
