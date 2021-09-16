package com.example.kubernetesdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Miwa Guhrés
 * Date: 16/09/2021
 * Time: 21:20
 * Project: Kubernetesdemo
 * Copyrigtht: MIT
 */
@RestController
//@RequestMapping("/")
public class GreetngController {
    @GetMapping("/hello")
    public String greeting() {
        return "Hello World!!!";
    }
}
