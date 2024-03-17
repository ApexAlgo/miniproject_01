package com.oracle.phonebook.service.Impl;

import com.oracle.phonebook.entity.Contact;
import com.oracle.phonebook.repository.ContactRepository;
import com.oracle.phonebook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Override
    public String saveContact(Contact contact) {
        Contact saved = contactRepository.save(contact);
        return "contact saved successfully";
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contactList = contactRepository.findAll();
        return contactList;
    }

    @Override
    public Contact getContactById(Integer contactId) {

        return contactRepository.findById(contactId).get();
    }

    @Override
    public String updateContact(Contact contact) {
        Optional<Contact> optionalContact = contactRepository.findById(contact.getContactId());
        if (optionalContact.isPresent()){
            Contact existingContact = optionalContact.get();
            existingContact.setContactName(contact.getContactName());
            existingContact.setContactEmail(contact.getContactEmail());
            existingContact.setContactPhno(contact.getContactPhno());

            contactRepository.save(existingContact);
            return "contact saved successfully";
        }else{
          return "contact does not exists";
        }

    }

    @Override
    public List<Contact> deleteContactById(Integer contactId) {
        return null;
    }
}
