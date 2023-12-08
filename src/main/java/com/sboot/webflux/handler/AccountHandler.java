package com.sboot.webflux.handler;

import com.sboot.webflux.dao.CustomerDAO;
import com.sboot.webflux.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class AccountHandler {

    @Autowired
    private CustomerDAO customerDAO;

    public Mono<ServerResponse> accountHolder(ServerRequest serverRequest){
        Mono<Customer> customer1 = customerDAO.getAllCustomer().filter(c -> c.getName().equals("customer1")).single();
        return ServerResponse.ok().body(customer1,Customer.class);
    }
}
