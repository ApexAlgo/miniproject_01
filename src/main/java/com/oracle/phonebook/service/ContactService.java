package com.oracle.phonebook.service;

import com.oracle.phonebook.entity.Contact;

import java.util.List;

public interface ContactService {
    public String saveContact(Contact contact);
    public List<Contact> getAllContacts();

    public Contact getContactById(Integer contactId);

    public String updateContact(Contact contact);

    public List<Contact> deleteContactById(Integer contactId);
}
