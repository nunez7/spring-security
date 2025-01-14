package vass.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vass.com.model.Loans;
import vass.com.service.contract.LoanService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoansController {

    private final LoanService loansService;

    @GetMapping("/loans")
    @PostAuthorize("hasRole('USER')")
    public List<Loans> getLoanDetails(@RequestParam long id) {
        List<Loans> loans = loansService.findByCustomerIdOrderByStartDtDesc(id);
        if (loans != null) {
            return loans;
        } else {
            return null;
        }
    }

}
