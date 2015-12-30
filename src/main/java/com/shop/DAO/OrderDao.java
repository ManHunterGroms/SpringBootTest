package com.shop.DAO;

import com.shop.Model.Customer;
import com.shop.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
@Repository
public interface OrderDao extends JpaRepository<Order, Long> {

    @Query("select o from Order as o where o.customer.id = :customer_id")
    Collection<Order> getUserOrders(@Param(value = "customer_id") long customer_id);
}
