package com.example.Task10Demo.Entity;

import jakarta.el.ELManager;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Customer extends BaseEntity {
    @NotBlank(message = "Customer Name Cannot Be Empty!")
    private String customerName;
    private String accountNumber;
    @PositiveOrZero(message = "Balance Cannot Be Negative!")
    private Double balance;
    @Email(message = "Email must be valid!")
    @NotBlank(message = "Email Cannot Be Empty!")
    private String email;
    private String phoneNumber;

}
