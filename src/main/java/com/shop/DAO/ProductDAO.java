package com.shop.DAO;

import com.shop.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bymot on 21.12.2015.
 */
@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

}
