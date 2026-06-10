package com.example.Task10Demo.Entity;

import jakarta.el.ELManager;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer extends BaseEntity {
    private String customerName;
    private String accountNumber;
    private Double balance;
    private String email;
    private String phoneNumber;

}
