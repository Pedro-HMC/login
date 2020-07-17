package com.programem.securitypessoal;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter {
   
  @Override
  protected void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder
    .inMemoryAuthentication()
    .withUser("Pedro").password("{noop}123")
        .roles("USER")
        .and()
    .withUser("Kaline").password("{noop}alien")
        .roles("USER")
        .and()
    .withUser("Wesley").password("{noop}diadasbruxas")
    .roles("USER");    
  }
}