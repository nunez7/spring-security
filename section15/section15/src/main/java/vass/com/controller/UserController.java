package vass.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vass.com.model.Customer;
import vass.com.service.contract.CustomerService;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final CustomerService service;
    @RequestMapping("/user")
    public Customer getUserDetailsAfterLogin(Authentication authentication) {
        Optional<Customer> optionalCustomer = service.findByEmail(authentication.getName());
        return optionalCustomer.orElse(null);
    }

}
