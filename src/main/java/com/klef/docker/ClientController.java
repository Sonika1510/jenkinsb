package com.klef.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/dockerapi")
public class ClientController {
    @GetMapping("/")
    public String home()
    {
    	return "Docker - Spring Boot Demo";
    }
    @GetMapping("/klu")
    public String klu()
    {
    	return "Kl university";
    }
    
}
