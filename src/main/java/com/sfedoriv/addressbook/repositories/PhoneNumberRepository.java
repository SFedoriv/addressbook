package com.sfedoriv.addressbook.repositories;

import com.sfedoriv.addressbook.model.PhoneNumber;
import org.springframework.data.repository.CrudRepository;

public interface PhoneNumberRepository extends CrudRepository<PhoneNumber, Long> {
}
