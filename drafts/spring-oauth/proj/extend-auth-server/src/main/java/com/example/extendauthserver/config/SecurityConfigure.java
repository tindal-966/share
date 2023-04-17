package com.example.extendauthserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/oauth/**").permitAll() // 允许通行
                .antMatchers("/oauth/token").permitAll()
                .antMatchers("/oauth/token_key").permitAll()
                .antMatchers("/oauth/check_token").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic(); // 使用 Basic 身份验证
    }
}
