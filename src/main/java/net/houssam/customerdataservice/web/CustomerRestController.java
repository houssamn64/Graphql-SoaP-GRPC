package net.houssam.customerdataservice.web;


import lombok.AllArgsConstructor;
import net.houssam.customerdataservice.entities.Customer;
import net.houssam.customerdataservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController {
    private CustomerRepository customerRepository;

    //Method to return a list of customer
    @GetMapping("/customers")
    private List<Customer> customerList(){
        return customerRepository.findAll();
    }

    //Method to return one customer
    @GetMapping("/customers/{id}")
    private Customer customerById(@PathVariable Long id){
        return customerRepository.findById(id).get();
    }

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return customer;
    }

}
