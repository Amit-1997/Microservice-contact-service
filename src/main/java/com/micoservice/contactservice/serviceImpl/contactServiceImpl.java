package com.micoservice.contactservice.serviceImpl;

import com.micoservice.contactservice.entity.Contacts;
import com.micoservice.contactservice.service.contactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class contactServiceImpl implements contactService {

   List<Contacts> contacts=List.of(
           new Contacts(1l,"amit@gmail.com", "Amit", 1311L),
           new Contacts(2l,"Vaibhav@gmail.com", "Vaibhav", 1311L),
           new Contacts(3l,"ajit@gmail.com", "Ajit", 1312L)
   );

    @Override
    public List<Contacts> getContactsById(Long id) {
     return contacts.stream().filter(e->e.getCId().equals(id)).collect(Collectors.toList());
    }
}
