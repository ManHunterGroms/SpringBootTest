package com.shop.Service;

import com.shop.DAO.OrderDao;
import com.shop.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
@Service
public class OrderServiceimpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order create(Order order) {
        return orderDao.save(order);
    }

    @Override
    public Order findOrderById(long id) {
        return orderDao.findOne(id);
    }

    @Override
    public Collection<Order> getAllOrders() {
        return orderDao.findAll();
    }
}
