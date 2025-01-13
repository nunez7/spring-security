package vass.com.service.contract;

import vass.com.model.AccountTransactions;

import java.util.List;

public interface BalanceService {
    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(long customerId);

}
