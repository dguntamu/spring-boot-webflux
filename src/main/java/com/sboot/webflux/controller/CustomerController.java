package com.sboot.webflux.controller;

import com.sboot.webflux.dto.Customer;
import com.sboot.webflux.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public Flux<Customer> getAllCustomer(){
        return customerService.getAllCustomers();
    }
}
