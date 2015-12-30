package com.shop.Service;

import com.shop.Model.Category;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
public interface CategoryService {

    Category create(Category category);
    Category findCategoryById(long id);
    Collection<Category> getAllCategories();
}
