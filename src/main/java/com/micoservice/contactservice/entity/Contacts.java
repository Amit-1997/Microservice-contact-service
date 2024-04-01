package com.micoservice.contactservice.entity;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Contacts {

    private Long cId;
    private String email;
    private String name;
    private Long userId;
}
