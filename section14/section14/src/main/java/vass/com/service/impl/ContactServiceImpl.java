package vass.com.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vass.com.model.Contact;
import vass.com.repository.ContactRepository;
import vass.com.service.contract.ContactService;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository repository;

    @Override
    @Transactional
    public Contact save(Contact contact) {
        return repository.save(contact);
    }
}
