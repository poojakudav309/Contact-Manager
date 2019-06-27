package com.contactmanager.contacts.repository;

import com.contactmanager.contacts.model.Contact;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact,Integer> {
    Contact findBy_id(ObjectId _id);

}
