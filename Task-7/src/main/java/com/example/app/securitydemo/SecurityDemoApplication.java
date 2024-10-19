package com.example.app.securitydemo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDemoApplication.class, args);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "1971freez"; // Замените на нужный пароль
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}