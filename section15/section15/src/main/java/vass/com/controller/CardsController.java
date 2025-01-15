package vass.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vass.com.model.Cards;
import vass.com.model.Customer;
import vass.com.service.contract.CardsService;
import vass.com.service.contract.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CardsController {

    private final CardsService cardsService;
    private final CustomerService customerService;

    @GetMapping("/cards")
    public List<Cards> getCardsDetails(@RequestParam String email){
        Optional<Customer> optionalCustomer = customerService.findByEmail(email);
        if (optionalCustomer.isPresent()) {
            List<Cards> cards = cardsService.findByCustomerId(optionalCustomer.get().getId());
            if (cards != null) {
                return cards;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

}
