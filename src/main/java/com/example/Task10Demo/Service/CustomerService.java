package com.example.Task10Demo.Service;

import com.example.Task10Demo.Entity.Customer;
import com.example.Task10Demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TransferQueue;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer save(Customer customer) throws Exception{

        if (customerRepository.existsByAccountNumber(customer.getAccountNumber()) != null) {
            throw new RuntimeException("Duplicate account number");
        }
        customer.setCtreationDate(new Date());
        customer.setIsActive(true);
        return customerRepository.save(customer);

    }

    public List<Customer> getAll(){
        return customerRepository.getAll();
    }

    public Customer getById(Integer id) throws Exception{
        Customer customer = customerRepository.getById(id);
        if( customer != null ) return customer;
        throw new Exception("Customer not Found!");
    }

    public Customer getByName(String name) throws Exception{
        Customer customer = customerRepository.getByName(name);
        if( customer != null ) return customer;
        throw new Exception("Customer not Found!");
    }

    public Customer update(Integer id,Customer customer) throws Exception{
        Customer customerToUpdate = customerRepository.getById(id);
        if(customerToUpdate == null){
            throw new Exception("Customer not Found!");
        }
        customerToUpdate.setCustomerName(customer.getCustomerName());
        customerToUpdate.setAccountNumber(customer.getAccountNumber());
        customerToUpdate.setBalance(customer.getBalance());
        customerToUpdate.setEmail(customer.getEmail());
        customerToUpdate.setPhoneNumber(customer.getPhoneNumber());
        customerToUpdate.setUpdateDate(new Date());
        return customerRepository.save(customerToUpdate);
    }


    public Boolean delete(Integer id){
        Customer customer = customerRepository.getById(id);
        if (customer != null) {
            customer.setIsActive(false);
            customer.setUpdateDate(new Date());
            customerRepository.save(customer);
            return true;
        } else {
            return false;
        }
    }




}
