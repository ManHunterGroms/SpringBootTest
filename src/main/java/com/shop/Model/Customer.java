package com.shop.Model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by bymot on 23.12.2015.
 */
@Entity
@Table(name = "customer")
public class Customer {
    private Long id;
    private User user;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    private List<Address> addresses;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, unique = false)
    @Cascade(CascadeType.SAVE_UPDATE)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "first_name", nullable = false)
    @NotNull
    @Size(min = 2, max = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    @NotNull
    @Size(min = 2, max = 20)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Cascade(CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Column(name = "phone", nullable = true)
    @NotNull
    @Size(min = 6, max = 15)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
