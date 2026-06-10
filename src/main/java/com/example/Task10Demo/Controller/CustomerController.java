package com.example.Task10Demo.Controller;

import com.example.Task10Demo.Entity.Customer;
import com.example.Task10Demo.Service.CustomerService;
import com.example.Task10Demo.Validation.CustomerValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("add")
    public Customer add(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping("getAll")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("getById")
    public Customer getById(@RequestParam Integer id) throws Exception{
        return customerService.getById(id);
    }

    @GetMapping("getByName")
    public Customer getByName(@RequestParam String name) throws Exception{
        return customerService.getByName(name);
    }

    @PutMapping("update/{id}")
    public Customer update(@PathVariable Integer id, @RequestBody Customer customer) throws Exception{
        return customerService.update(id, customer);
    }

    @DeleteMapping("delete/{id}")
    public Boolean delete(@PathVariable Integer id){
        return customerService.delete(id);
    }



}
