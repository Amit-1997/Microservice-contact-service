package com.micoservice.contactservice.service;

import com.micoservice.contactservice.entity.Contacts;

import java.util.List;

public interface contactService {

    public List<Contacts> getContactsById(Long id);
}
