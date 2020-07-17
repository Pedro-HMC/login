package com.programem.securitypessoal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CuriosidadesController {
    @GetMapping("/curiosidades")
    public String curio(){
        return "Curiosidades";
    }
    
}