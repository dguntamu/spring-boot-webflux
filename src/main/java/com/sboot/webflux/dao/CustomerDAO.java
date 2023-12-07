package com.sboot.webflux.dao;

import com.sboot.webflux.dto.Customer;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Component
public class CustomerDAO {
    public Flux<Customer> getAllCustomer(){
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(customer -> System.out.println("Processing Customer id : "+customer))
                .map(customer -> new Customer(customer,"customer"+customer));
    }
}
