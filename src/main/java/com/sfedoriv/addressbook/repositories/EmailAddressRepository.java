package com.sfedoriv.addressbook.repositories;

import com.sfedoriv.addressbook.model.EmailAddress;
import org.springframework.data.repository.CrudRepository;

public interface EmailAddressRepository extends CrudRepository<EmailAddress, Long> {
}
