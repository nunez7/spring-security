package vass.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vass.com.model.Cards;
import vass.com.service.contract.CardsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardsController {

    private final CardsService cardsService;

    @GetMapping("/cards")
    public List<Cards> getCardsDetails(@RequestParam long id){
        List<Cards> cards = cardsService.findByCustomerId(id);
        if (cards != null ) {
            return cards;
        }else {
            return null;
        }
    }

}
