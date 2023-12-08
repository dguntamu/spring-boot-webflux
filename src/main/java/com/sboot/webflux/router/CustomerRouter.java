package com.sboot.webflux.router;

import com.sboot.webflux.handler.AccountHandler;
import com.sboot.webflux.handler.CustomerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class CustomerRouter {

    @Autowired
    private CustomerHandler customerHandler;

    @Autowired
    private AccountHandler accountHandler;

    @Bean
    public RouterFunction<ServerResponse> routerFunction(){
        return RouterFunctions.route()
                .GET("/router/customers",customerHandler::getCustomers)
                .GET("/router/account",accountHandler::accountHolder)
                .build();
    }

}
