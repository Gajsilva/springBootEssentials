package br.com.devdojo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.SecurityExpressionHandler;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.Filter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.addFilter()
                .
    }
}
