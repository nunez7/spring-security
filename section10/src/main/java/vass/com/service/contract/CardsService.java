package vass.com.service.contract;

import vass.com.model.Cards;

import java.util.List;

public interface CardsService {
    List<Cards> findByCustomerId(long customerId);
}
