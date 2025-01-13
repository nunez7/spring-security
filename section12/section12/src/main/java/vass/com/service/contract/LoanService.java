package vass.com.service.contract;

import vass.com.model.Loans;

import java.util.List;

public interface LoanService {
    List<Loans> findByCustomerIdOrderByStartDtDesc(long customerId);
}
