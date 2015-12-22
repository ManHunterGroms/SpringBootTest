package com.shop.Service;

import com.shop.Model.Product;

import java.util.Collection;

/**
 * Created by bymot on 21.12.2015.
 */
public interface ProductService {
    Collection<Product> findAll();
    Product findOne(int id);
    Product create(Product product);
    Product update(Product product);
    void delete(int id);
}
