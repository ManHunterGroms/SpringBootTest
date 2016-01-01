package com.shop.Service;

import com.shop.DAO.CustomerDao;
import com.shop.DAO.UserDao;
import com.shop.Model.Customer;
import com.shop.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

    @Autowired
    private UserDao userDao;

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
    public Customer getCurrentCustomer() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();

        User user = userDao.findUserByEmail(email);
        if(user == null)
            return null;

        return customerDao.getCustomerByUserId(user.getId());
    }
}
