package com.shop.DAO;

import com.shop.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
@Repository
public interface AddressDao extends JpaRepository<Address, Long> {

    @Query("select a from Address as a where a.customer.id = :customer_id")
    Collection<Address> getUserAddresses(@Param(value = "customer_id") long customer_id);
}
