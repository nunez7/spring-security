package vass.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vass.com.model.Accounts;
import vass.com.service.contract.AccountsService;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountsService accountService;

    @GetMapping("/account")
    public Accounts getAccountDetails(@RequestParam long id){
        Accounts accounts = accountService.findByCustomerId(id);
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }
    }

}
