package com.sboot.webflux.handler;

import com.sboot.webflux.dao.CustomerDAO;
import com.sboot.webflux.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerHandler {

    @Autowired
    private CustomerDAO customerDAO;

    public Mono<ServerResponse> getCustomers(ServerRequest serverRequest){
        //Flux<Customer> allCustomer = customerDAO.getAllCustomer();
        return ServerResponse.ok().body(customerDAO.getAllCustomer(),Customer.class);
    }
}
