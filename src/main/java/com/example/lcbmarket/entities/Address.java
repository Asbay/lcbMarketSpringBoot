package com.example.lcbmarket.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_name")
    private Long id;

    private String city;
    private String postCode;
    private String street;
    @Column(name = "house_no")
    private String houseNumber;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer;


}
