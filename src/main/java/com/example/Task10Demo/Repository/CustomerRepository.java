package com.example.Task10Demo.Repository;

import com.example.Task10Demo.Entity.Customer;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c WHERE c.isActive = true")
    List<Customer> getAll();

    @Query("SELECT c FROM Customer c WHERE c.isActive = true AND c.id = :id")
    Customer getById(@Param("id") Integer id);

    @Query("SELECT c FROM Customer c WHERE c.isActive = true AND c.customerName =:customerName")
    Customer getByName(@Param("customerName") String customerName);

    @Query("SELECT c FROM Customer c where c.accountNumber=:accountNumber")
    Customer existsByAccountNumber(@Param("accountNumber") String accountNumber);

}