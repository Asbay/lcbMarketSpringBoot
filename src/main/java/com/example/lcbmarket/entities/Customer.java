package com.example.lcbmarket.entities;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "customer_id",nullable = false,unique = true)
    private Long id;
    @Column(nullable = false,unique = true)
    private  String email;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(name = "mobil_number")
    private String telNo;
    @Column()

    private String password;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<Address> addresses;






}
