package com.contactmanager.contacts.controller;

import com.contactmanager.contacts.model.Contact;
import com.contactmanager.contacts.repository.ContactRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository crepo;

    // returns all the contacts

    @GetMapping("/contact")
    public List<Contact> getContact(){

        return crepo.findAll();
    }

    //find the details by id

    @GetMapping(value = "/contact/{id}")
    public Contact getContactById(@PathVariable("id") ObjectId id) {
        return crepo.findBy_id(id);
    }

    //add contact to the contact list

    @PostMapping("/add")
    public Contact addContact(@Valid @RequestBody Contact contact){
        contact.set_id(ObjectId.get());
        crepo.save(contact);
        return contact;
    }

    //delete the contact with specific id

    @DeleteMapping("/contact/{id}")
    public void deleteContact(@PathVariable ObjectId id){
        crepo.delete(crepo.findBy_id(id));
    }
}
