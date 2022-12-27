package com.insidercloud.airlinereservation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  private final LogoutHandler logoutHandler;

  public SecurityConfig(LogoutHandler logoutHandler) {
    this.logoutHandler = logoutHandler;
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    http.authorizeHttpRequests(
            requests ->
                requests
                    .requestMatchers(
                        "/",
                        "/*.png",
                        "/*.ico",
                        "/*.xml",
                        "/*.json",
                        "/packages/**",
                        "/images/**",
                        "/css/**",
                        "/js/**")
                    .permitAll()
                    .anyRequest()
                    .authenticated())
        .oauth2Login()
        .and()
        .logout(
            logout ->
                logout
                    .deleteCookies("JSESSIONID")
                    .invalidateHttpSession(true)
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .addLogoutHandler(logoutHandler)
                    .logoutSuccessUrl("/"));

    return http.build();
  }
}
