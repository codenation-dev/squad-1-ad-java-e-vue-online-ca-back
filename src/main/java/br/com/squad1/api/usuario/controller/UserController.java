package br.com.squad1.api.usuario.controller;

import br.com.squad1.api.usuario.controller.form.UserForm;
import br.com.squad1.api.usuario.model.User;
import br.com.squad1.api.usuario.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {
  
    @Autowired
    UserServiceImpl userServiceImpl;
    
    @PostMapping
    public ResponseEntity<User> cadastraUsuario(@RequestBody UserForm userForm) {        
        try {
            User user = userForm.converter();
            this.userServiceImpl.save(user);
            return new ResponseEntity<User>(HttpStatus.CREATED);
        }
        catch(Exception ex) {
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
   }
  
    @CrossOrigin(origins = "*")
    @GetMapping
    public Iterable retornaListaUsuariosCadastrados() {
        return this.userServiceImpl.findAll();
    }

}
