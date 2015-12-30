package com.shop.DAO;

import com.shop.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by bymot on 23.12.2015.
 */
@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

    @Query("select c from Customer as c where c.user.id = :user_id")
    Customer getCustomerByUserId(@Param(value = "user_id") long id);
}
