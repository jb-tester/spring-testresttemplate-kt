package com.mytests.spring.springtestresttemplatekt

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 **
 * <p>Created by irina on 19.05.2021.</p>
 * <p>Project: spring-testresttemplate-kt</p>
 **
 */
@Component
class MyComponent {

    @Value("foo")
    var foo: String? = null

    @Value("How are you?")
    var greeting: String? = null

    @Value("Have a nice day!")
    var parting: String? = null
}