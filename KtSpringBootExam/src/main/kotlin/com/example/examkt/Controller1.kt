package com.example.examkt

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController{
    @GetMapping("/")
    fun getHello() :String{
        return "Hello Kotlin && SpringBoot"
    }
}