package com.nodi.ecommerce.nodi.hello;

import com.nodi.ecommerce.nodi.entities.UserDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping("/userDetail")
    public UserDetail helloUser(){
        return new UserDetail("Mansour", "Malloum","Yaounde");
    }

}
