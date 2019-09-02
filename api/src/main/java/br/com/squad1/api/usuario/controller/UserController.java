package br.com.squad1.api.usuario.controller;

import br.com.squad1.api.usuario.model.User;
import br.com.squad1.api.usuario.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {
  
    @Autowired
    UserServiceImpl userServiceImpl;
    
    @PostMapping
    public void cadastraUsuario(@RequestParam String userName, @RequestParam String password, @RequestParam String email) {        
        User user = new User();
        user.setName(userName);
        user.setSenha(password);
        user.setEmail(email);

        this.userServiceImpl.save(user);
    }
  
    //Método de teste (excluir posteriormente):
    @GetMapping
    public Iterable retornaListaUsuariosCadastrados() {
        return this.userServiceImpl.findAll();
    }
}
