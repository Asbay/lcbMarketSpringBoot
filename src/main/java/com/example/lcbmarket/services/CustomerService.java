package com.example.lcbmarket.services;


import com.example.lcbmarket.entities.Customer;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public interface CustomerService {


    Customer getCustomer(Long id);
    Boolean save(Customer customer);

    Boolean delete(@NonNull Long id);

    List<Customer> getAllCustomers();

    Customer updateCustomer(Long id , Customer updatedCustomer);





}
