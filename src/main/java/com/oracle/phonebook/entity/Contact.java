package com.oracle.phonebook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor

public class Contact {
    @Id


    private Integer contactId;
    private String contactName;
    private String contactEmail;
    private Long contactPhno;


}
