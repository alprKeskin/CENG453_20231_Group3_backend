package io.github.alprKeskin.kasimpamuk.thesettlersofcatan.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Service;

@Service
@Configuration
@EnableWebSecurity
public class LoginService {
     // login service with oauth 2.0
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        return http.
//                authorizeRequests( auth -> {
//                    auth.requestMatchers( "/api").permitAll();
//                    auth.anyRequest().authenticated();
//                        })
//                .oauth2Login(Customizer.withDefaults())
//                .formLogin(Customizer.withDefaults())
//                .build();
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
