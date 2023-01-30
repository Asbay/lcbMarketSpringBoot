package com.example.lcbmarket.services;

import com.example.lcbmarket.entities.Address;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {


    Address getAddressesById(Long id);
    List<Address> getAddressesByUserId(Long userId);

    Boolean  deleteAddress(@NonNull Long id);
    Boolean saveAddress(Address address);

    Address updateAddress();

}
