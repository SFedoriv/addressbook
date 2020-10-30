package com.sfedoriv.addressbook.repositories;

import com.sfedoriv.addressbook.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository <Person, Long>{
    @Override
    default <S extends Person> S save(S s) {
        return null;
    }

    @Override
    default Optional<Person> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default Iterable<Person> findAll() {
        return null;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Person person) {

    }
}
