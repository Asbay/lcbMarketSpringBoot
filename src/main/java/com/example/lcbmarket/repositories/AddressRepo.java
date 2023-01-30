package com.example.lcbmarket.repositories;

import com.example.lcbmarket.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {

}
