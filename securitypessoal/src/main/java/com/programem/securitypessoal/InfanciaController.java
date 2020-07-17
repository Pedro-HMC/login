package com.programem.securitypessoal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfanciaController {
    @GetMapping("/infancia")
    public String infancia(){
        return "Infância";
    }
    
}