package vass.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vass.com.model.Customer;
import vass.com.repository.CustomerRepository;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository repository;

    @Override
    public Optional<Customer> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }
}
