package com.shop.Service;

import com.shop.DAO.ProductDAO;
import com.shop.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by bymot on 21.12.2015.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public Collection<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findOne(int id) {
        Product product = productDAO.findOne(id);
        return product;
    }

    @Override
    public Product create(Product product) {
        if(product.getId() != 0) {
            return null;
        }

        Product saveProduct = productDAO.save(product);
        return saveProduct;
    }

    @Override
    public Product update(Product product) {
        Product productPersisted = findOne(product.getId());
        if(productPersisted == null) {
            return null;
        }

        Product saveProduct = productDAO.save(product);
        return saveProduct;
    }

    @Override
    public void delete(int id) {
        productDAO.delete(id);
    }
}
