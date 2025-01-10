package vass.com.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vass.com.model.AccountTransactions;
import vass.com.repository.AccountTransactionsRepository;
import vass.com.service.contract.BalanceService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BalanceServiceImpl implements BalanceService {

    private final AccountTransactionsRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(long customerId) {
        return repository.findByCustomerIdOrderByTransactionDtDesc(customerId);
    }
}
