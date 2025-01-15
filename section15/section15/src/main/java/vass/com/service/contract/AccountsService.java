package vass.com.service.contract;

import vass.com.model.Accounts;

public interface AccountsService {
    Accounts findByCustomerId(long customerId);
}
