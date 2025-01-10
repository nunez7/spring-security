package vass.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vass.com.model.AccountTransactions;
import vass.com.service.contract.BalanceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BalanceController {

    private final BalanceService service;

    @GetMapping("/balance")
    public List<AccountTransactions> getBalanceDetails(@RequestParam long id){
        List<AccountTransactions> accountTransactions = service.
                findByCustomerIdOrderByTransactionDtDesc(id);
        if (accountTransactions != null) {
            return accountTransactions;
        } else {
            return null;
        }
    }

}
