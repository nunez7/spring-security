package vass.com.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vass.com.model.Cards;
import vass.com.repository.CardsRepository;
import vass.com.service.contract.CardsService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardsServiceImpl implements CardsService {

    private final CardsRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Cards> findByCustomerId(long customerId) {
        return repository.findByCustomerId(customerId);
    }
}
