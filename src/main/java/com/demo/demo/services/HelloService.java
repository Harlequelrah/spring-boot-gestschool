package com.demo.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello() {
        return "Hello from HelloService";
    }

}
