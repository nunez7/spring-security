package vass.com.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vass.com.model.Loans;
import vass.com.repository.LoanRepository;
import vass.com.service.contract.LoanService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoansServiceImpl implements LoanService {

    private final LoanRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Loans> findByCustomerIdOrderByStartDtDesc(long customerId) {
        return repository.findByCustomerIdOrderByStartDtDesc(customerId);
    }
}
