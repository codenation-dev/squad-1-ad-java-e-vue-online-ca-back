package br.com.squad1.api.usuario.controller;

import br.com.squad1.api.usuario.controller.form.UserForm;
import br.com.squad1.api.usuario.model.User;
import br.com.squad1.api.usuario.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
  
    @Autowired
    UserServiceImpl userServiceImpl;
    
    @PostMapping("/register")
    public ResponseEntity<User> cadastraUsuario(@RequestBody UserForm userForm) {
        try {
            User user = userForm.converter();
            this.userServiceImpl.save(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
  
    @CrossOrigin(origins = "*")
    @GetMapping
    public Iterable retornaListaUsuariosCadastrados() {
        return this.userServiceImpl.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Optional<User> retornaUserById(@PathVariable Long userId) {
        return this.userServiceImpl.findById(userId);
    }
}
