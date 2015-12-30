package com.shop.Service;

import com.shop.DAO.CategoryDao;
import com.shop.Model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category create(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public Category findCategoryById(long id) {
        return categoryDao.findOne(id);
    }

    @Override
    public Collection<Category> getAllCategories() {
        return categoryDao.findAll();
    }
}
