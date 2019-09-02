package br.com.squad1.api.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter  {

  //Configurações de autenticação:
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {

  }

  //Configurações de autorização:
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    
      http.authorizeRequests()
              .antMatchers("/register").permitAll();
    
  }

  //Configurações de recursos estáticos:
  @Override
  public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/**.html", "/v2/api-docs", "/wegjars/**", "/configuration/**", "/swagger-resources/**");
  }
  
  
  
}
