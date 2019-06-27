package com.contactmanager.contacts.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "contacts")
public class Contact {
    @Id
    private ObjectId _id;

    public String getGender() {
        return gender;
    }

    public Contact(){

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String fname;
    private String lname;
    private String email;
    private String address;
    private String gender;
    private int phone;

    public Contact(String fname, String lname, String email, String address, String gender, int phone) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
