package com.example.lcbmarket.services.Impl;

import com.example.lcbmarket.entities.Customer;
import com.example.lcbmarket.repositories.CustomerRepo;
import com.example.lcbmarket.services.CustomerService;
import lombok.NonNull;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    private CustomerRepo customerRepo;

    @Override
    public Customer getCustomer(Long id) {
        ;
    }

    @Override
    public Boolean save(Customer customer) {
        return null;
    }

    @Override
    public Boolean delete(@NonNull Long id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        return null;
    }
}
