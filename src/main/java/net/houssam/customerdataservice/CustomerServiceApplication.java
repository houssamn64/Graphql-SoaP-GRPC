package net.houssam.customerdataservice;

import net.houssam.customerdataservice.entities.Customer;
import net.houssam.customerdataservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("David Johns")
                    .email("d.johns@gmail.com").build());

            customerRepository.save(Customer.builder().name("Alex Cobbs")
                    .email("Darkness@gmail.com").build());

            customerRepository.save(Customer.builder().name("Bob Alex")
                    .email("b.Alex@gmail.com").build());
        };
    }

}
