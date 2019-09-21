package br.com.squad1.api.usuario.controller.form;

import br.com.squad1.api.usuario.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserForm {

  private String name;
  private String password;
  private String email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User converter() {
    return new User(this.name, new BCryptPasswordEncoder().encode(this.password), this.email);
  }
}
