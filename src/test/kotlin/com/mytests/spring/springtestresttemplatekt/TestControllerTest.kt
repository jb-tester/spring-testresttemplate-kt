package com.mytests.spring.springtestresttemplatekt

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 *
 *
 * Created by irina on 19.05.2021.
 *
 * Project: spring-testresttemplate-kt
 *
 */
@SpringBootTest
class TestControllerTest(@Autowired val myComponent: MyComponent)
{
  @Test
  fun testComponent(){
      Assertions.assertThat(myComponent.foo.equals("foo"))
  }

}