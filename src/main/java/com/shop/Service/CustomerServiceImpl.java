package com.shop.Service;

import com.shop.DAO.CustomerDao;
import com.shop.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.Collection;

/**
 * Created by bymot on 23.12.2015.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer create(Customer customer) {
        if(customer.getId() != null) {
            return null;
        }
        return customerDao.save(customer);
    }

    @Override
    public Customer findCustomerById(long id) {
        return customerDao.findOne(id);
    }

    @Override
    public Customer findCustomerByEmail(String email) {
        return null;
    }

    @Override
    public Collection<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer findCustomerByUserId(long id) {
        return customerDao.getCustomerByUserId(id);
    }
}
