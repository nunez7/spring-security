package vass.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vass.com.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
	
	
}
