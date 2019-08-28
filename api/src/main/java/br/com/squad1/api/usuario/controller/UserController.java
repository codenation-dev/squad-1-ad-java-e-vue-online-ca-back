package br.com.squad1.api.usuario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {
  

//Falta implementar.

  //Método de teste:
  @GetMapping
  public String testeRequisicao() {
      System.out.println("Recebeu uma requisicao GET...");
      return "Recebeu uma requisicao GET...";
  }
  
  
  
}
