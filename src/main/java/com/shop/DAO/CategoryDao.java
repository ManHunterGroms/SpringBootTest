package com.shop.DAO;

import com.shop.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bymot on 29.12.2015.
 */
@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {
}
