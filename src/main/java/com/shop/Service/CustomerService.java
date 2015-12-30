package com.shop.Service;

import com.shop.Model.Customer;

import java.util.Collection;

/**
 * Created by bymot on 23.12.2015.
 */
public interface CustomerService {
    Customer create(Customer customer);
    Customer findCustomerById(long id);
    Customer findCustomerByEmail(String email);
    Collection<Customer> getAllCustomers();
    Customer findCustomerByUserId(long id);
}
