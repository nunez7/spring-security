package vass.com.service;

import vass.com.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findByEmail(String email);
    Customer save(Customer customer);
}
