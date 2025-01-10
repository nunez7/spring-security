package vass.com.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vass.com.model.Accounts;
import vass.com.repository.AccountsRepository;
import vass.com.service.contract.AccountsService;

@Service
@RequiredArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private final AccountsRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Accounts findByCustomerId(long customerId) {
        return repository.findByCustomerId(customerId);
    }
}
