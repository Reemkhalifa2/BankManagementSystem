package com.example.Task10Demo.Entity;

import jakarta.el.ELManager;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Customer extends BaseEntity {
    private String customerName;
    private String accountNumber;
    private Double balance;
    private String email;
    private String phoneNumber;

}
