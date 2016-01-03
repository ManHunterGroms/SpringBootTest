package com.shop.Service;

import com.shop.DAO.ProductDAO;
import com.shop.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Product> findAll(Pageable pageable) {
        return productDAO.findAll(pageable);
    }

    @Override
    public Product findOne(Long id) {
        Product product = productDAO.findOne(id);
        return product;
    }

    @Override
    public Product create(Product product) {
//        if(product.getId() != 0) {
//            return null;
//        }

        Product saveProduct = productDAO.save(product);
        return saveProduct;
    }

    @Override
    public long count() {
        return productDAO.findAll().size();
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
    public void delete(Long id) {
        productDAO.delete(id);
    }
}
