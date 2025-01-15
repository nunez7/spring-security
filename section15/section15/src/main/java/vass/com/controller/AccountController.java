package vass.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vass.com.model.Accounts;
import vass.com.model.Customer;
import vass.com.service.contract.AccountsService;
import vass.com.service.contract.CustomerService;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountsService accountService;

    private final CustomerService customerService;

    @GetMapping("/account")
    public Accounts getAccountDetails(@RequestParam  String email){
        Optional<Customer> optionalCustomer = customerService.findByEmail(email);
        if (optionalCustomer.isPresent()) {
            Accounts accounts = accountService.findByCustomerId(optionalCustomer.get().getId());
            if (accounts != null) {
                return accounts;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

}
