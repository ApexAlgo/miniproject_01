package com.oracle.phonebook.repository;

import com.oracle.phonebook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
