package com.sfedoriv.addressbook.repositories;

import com.sfedoriv.addressbook.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
