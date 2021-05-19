package com.mytests.spring.springtestresttemplatekt

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 **
 * <p>Created by irina on 18.05.2021.</p>
 * <p>Project: spring-testresttemplate-kt</p>
 **
 */
@RestController
class TestController(@Autowired val myComponent: MyComponent) {


    @GetMapping("/hello")
    fun hello(): String? {

        return myComponent.greeting
    }
    @GetMapping("/bye")
    fun bye(): String? {

        return myComponent.parting
    }
}