package com.sboot.webflux.service;

import com.sboot.webflux.dao.CustomerDAO;
import com.sboot.webflux.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    public Flux<Customer> getAllCustomers(){
        return customerDAO.getAllCustomer();
    }
}
