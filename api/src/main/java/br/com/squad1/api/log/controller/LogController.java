package br.com.squad1.api.log.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    
    @GetMapping
    public String retornoLog() {
        return "ok.";
    }
    
}
