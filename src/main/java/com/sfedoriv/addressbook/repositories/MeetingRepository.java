package com.sfedoriv.addressbook.repositories;

import com.sfedoriv.addressbook.model.Meeting;
import org.springframework.data.repository.CrudRepository;

public interface MeetingRepository extends CrudRepository<Meeting, Long> {
}
