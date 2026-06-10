package com.example.Task10Demo.Validation;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class CustomerValidation {
    private String customerName;
    private String accountNumber;
    private Double balance;
    private String email;
    private String phoneNumber;



}
