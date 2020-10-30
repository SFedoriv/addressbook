package com.sfedoriv.addressbook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
public class EmailAddress extends BaseEntity{

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
