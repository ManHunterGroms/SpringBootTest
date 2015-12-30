package com.shop.Service;

import com.shop.DAO.AddressDao;
import com.shop.Model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;


    @Override
    public Address create(Address address) {
        return addressDao.save(address);
    }

    @Override
    public Address findCustomerById(long id) {
        return addressDao.findOne(id);
    }

    @Override
    public Collection<Address> getAllAddresses() {
        return addressDao.findAll();
    }
}
