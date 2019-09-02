package br.com.squad1.api.usuario.controller.form;

import br.com.squad1.api.usuario.model.User;
import org.springframework.web.bind.annotation.RequestParam;

public class UserForm {
  private String userName;
  private String password;
  private String email;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
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
    return new User(this.userName, this.password, this.email);
  }
          
}
