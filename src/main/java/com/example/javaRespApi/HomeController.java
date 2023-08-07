package com.example.javaRespApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/home")
    public String home(){
        return "hola mundo java resp api v2";
    }

    @RequestMapping("/azure")
    public String azure(){
        return "desplegado en azure";
    }
}
