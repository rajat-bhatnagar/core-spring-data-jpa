package com.vidya.niwas.corespringdatajpa;

import com.vidya.niwas.corespringdatajpa.data.Employee;
import com.vidya.niwas.corespringdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreSpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreSpringDataJpaApplication.class, args);
    }

    private void insertAdvocates(EmployeeRepository repository) {
        repository.save(new Employee("Mariah", "Bailey"));
        repository.save(new Employee("Laura", "Nierengarten"));
        repository.save(new Employee("Paul", "Bussler"));
        repository.save(new Employee("Mike", "Dvorak"));
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args) -> {
            insertAdvocates(repository);
            System.out.println(repository.findAll());

            // Custom Query Method to findEmployeeByLastNameContaining
            System.out.println(repository.findEmployeeByLastNameContaining("Bailey"));
        };
    }
}
