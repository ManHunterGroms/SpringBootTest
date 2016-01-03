package com.shop.Service;

import com.shop.Model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;

/**
 * Created by bymot on 21.12.2015.
 */
public interface ProductService {
    Collection<Product> findAll();
    Page<Product> findAll(Pageable pageable);
    Product findOne(Long id);
    Product create(Product product);
    long count();
    Product update(Product product);
    void delete(Long id);
}
