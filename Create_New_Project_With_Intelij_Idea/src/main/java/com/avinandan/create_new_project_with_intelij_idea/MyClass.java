package com.avinandan.create_new_project_with_intelij_idea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//"RestController" is used for making API endpoint
@RestController
public class MyClass {
    @GetMapping("/home")
    public String home() {
        return "My Name is Avinandan Roy.I am from Daffodil International University.";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World, I am Avinandan. And I entering a new framework, that is Spring boot.";
    }
}
