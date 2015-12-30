package com.shop.DAO;

import com.shop.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
@Repository
public interface ImageDao extends JpaRepository<Image, Long> {

    @Query("select i from Image as i where i.product.id = :product_id")
    Collection<Image> getProductImages(@Param(value = "product_id") long product_id);
}
