package br.com.jackson.labprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*
* Projeto Spring Boot
*
* - JPA
* - Spring Web
* - H2 Database
* - OpenFeign
*
 */

@EnableFeignClients
@SpringBootApplication
public class LabProjetoSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(LabProjetoSpringApplication.class, args);
    }
}
