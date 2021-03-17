package com.pezio.practice;

import com.pezio.practice.student.Student;
import com.pezio.practice.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student varun = new Student(
                    "Varun",
                    "varun@gmail.com",
                    LocalDate.of(1997, JANUARY, 11)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1998, NOVEMBER, 11)
            );

            studentRepository.saveAll(List.of(varun, alex));
        };
    }
}
