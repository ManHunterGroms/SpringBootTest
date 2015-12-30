package com.shop.Service;

import com.shop.Model.Order;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
public interface OrderService {

    Order create(Order order);
    Order findOrderById(long id);
    Collection<Order> getAllOrders();
}
