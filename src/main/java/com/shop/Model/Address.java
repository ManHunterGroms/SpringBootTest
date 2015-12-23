package com.shop.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by bymot on 23.12.2015.
 */
@Entity
@Table(name = "address")
public class Address {
    private Long id;
    private Customer customer;
    private String city;
    private String address;

    public Address() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, unique = false)
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Column(name = "city", nullable = false, unique = true)
    @NotNull
    @Size(min = 2, max = 20)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "address", nullable = false, unique = true)
    @NotNull
    @Size(min = 2, max = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
