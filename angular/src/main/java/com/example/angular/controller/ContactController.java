package com.example.angular.controller;

import com.example.angular.model.Contact;
import com.example.angular.repository.ContactRepo;
import com.example.angular.repository.EmailAddressRepo;
import com.example.angular.repository.TelephonNumberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

    @Autowired
    ContactRepo contactRepo;
    @Autowired
    EmailAddressRepo emailAddressRepo;
    @Autowired
    TelephonNumberRepo telephonNumberRepo;

    @GetMapping(value = "/")
    List<Contact> getContacts() {
        List<Contact> contactList = contactRepo.findAll();
        return contactList;
    }

    @PostMapping("/add")
    void addContact(@RequestBody Contact contact) {
        if(contact.getId() != 0L){
            emailAddressRepo.deleteAllByContactId(contact.getId());
            telephonNumberRepo.deleteAllByContactId(contact.getId());
        }
            contactRepo.save(contact);
    }

    @GetMapping("/edit/{id}")
    Contact editContact(@PathVariable("id") Long id) {
        Contact contact = contactRepo.findById(id).get();
        return contact != null ? contact : new Contact();
    }

    @GetMapping(value = "/delete/{id}")
    void deleteContact(@PathVariable("id") Long id) {
        contactRepo.deleteById(id);
    }
}
