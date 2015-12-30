package com.shop.Service;

import com.shop.Model.Address;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
public interface AddressService {
    Address create(Address address);
    Address findCustomerById(long id);
    Collection<Address> getAllAddresses();
}
