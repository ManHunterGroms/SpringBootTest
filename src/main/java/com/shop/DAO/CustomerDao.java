package com.shop.DAO;

import com.shop.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bymot on 23.12.2015.
 */
@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {
}
