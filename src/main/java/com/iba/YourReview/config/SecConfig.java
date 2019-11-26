/*package com.iba.YourReview.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

public class SecConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configure(AuthenticationManagerBuilder managerBuilder) throws Exception {
        managerBuilder.jdbcAuthentication()
                .dataSource(dataSource)
                .withDefaultSchema()
                .withUser(User.withUsername("user"))
                .password(passwordEncoder().encode("pass"))
                .roles("USER"));
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}*/
