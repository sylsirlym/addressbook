package com.skills.addressbook.controller;

import com.skills.addressbook.dto.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by Sylvester Musyoki
 * Project addressbook
 * User: sylvester.musyoki
 * Date: 11/09/2021
 * Time: 12:59
 */
@RestController
@RequestMapping("/api")
public class AddressController {
    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact){
        contacts.put(contact.getId(), contact);
        return contact;
    }

    @GetMapping("/")
    public List<Contact> getAllContacts(){
        return new ArrayList<>(contacts.values());
    }
}
