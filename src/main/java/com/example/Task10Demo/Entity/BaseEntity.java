package com.example.Task10Demo.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;



@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date ctreationDate;
    private Date updateDate;
    private Boolean isActive;

}
