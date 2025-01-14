package vass.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vass.com.model.AccountTransactions;
import vass.com.model.Customer;
import vass.com.service.contract.BalanceService;
import vass.com.service.contract.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BalanceController {

    private final BalanceService service;
    private final CustomerService customerService;

    @GetMapping("/balance")
    public List<AccountTransactions> getBalanceDetails(@RequestParam String email){
        Optional<Customer> optionalCustomer = customerService.findByEmail(email);
        if (optionalCustomer.isPresent()) {
            List<AccountTransactions> accountTransactions = service.
                    findByCustomerIdOrderByTransactionDtDesc(optionalCustomer.get().getId());
            if (accountTransactions != null) {
                return accountTransactions;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

}
