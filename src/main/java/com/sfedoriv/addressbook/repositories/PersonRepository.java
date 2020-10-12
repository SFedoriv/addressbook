package com.sfedoriv.addressbook.repositories;

import com.sfedoriv.addressbook.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository <Person, Long>{
}
