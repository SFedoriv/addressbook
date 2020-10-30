package com.sfedoriv.addressbook.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
public class Person extends BaseEntity{

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    @OneToMany
    private Set<EmailAddress> emailAddresses = new HashSet<>();
}
