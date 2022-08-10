package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(
//            StudentRepository repository){
//        return args -> {
//             Student juan = new Student(
//                    "Juan",
//                    "juansiallagan9@gmail.com",
//                    LocalDate.of(2000, Month.JULY, 9)
//
//            );
//            Student marihot = new Student(
//                    "marihot",
//                    "marihotsiallagan9@gmail.com",
//                    LocalDate.of(2001, Month.JULY, 9)
//
//            );
//
//            repository.saveAll(
//                    List.of(juan, marihot)
//            );
//        };
//    }

}
