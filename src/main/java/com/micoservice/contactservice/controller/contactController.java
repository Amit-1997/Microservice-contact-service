package com.micoservice.contactservice.controller;

import com.micoservice.contactservice.entity.Contacts;
import com.micoservice.contactservice.serviceImpl.contactServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class contactController {

    @Autowired
    private contactServiceImpl contactService;
    @GetMapping("{id}")
    public List<Contacts> getContactsById(@PathVariable Long id)
    {
      return contactService.getContactsById(id);
    }
}
