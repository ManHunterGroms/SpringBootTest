package com.shop.DAO;

import com.shop.Model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by bymot on 21.12.2015.
 */
@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

    Page<Product> findAll(Pageable pageable);
}
