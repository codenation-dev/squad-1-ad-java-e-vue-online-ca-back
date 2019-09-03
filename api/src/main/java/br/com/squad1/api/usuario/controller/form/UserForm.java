package br.com.squad1.api.usuario.controller.form;

import br.com.squad1.api.usuario.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserForm {
    private String nome;
    private String senha;
    private String email;

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getSenha() {
      return senha;
    }

    public void setSenha(String senha) {
      this.senha = senha;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public User converter() {
      return new User(this.nome, new BCryptPasswordEncoder().encode(this.senha), this.email);
    }
}
