package com.shop.web.api;

import com.shop.Model.Product;
import com.shop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by bymot on 21.12.2015.
 */
@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/api",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> home() {
        return new ResponseEntity<String>("Hello world", HttpStatus.OK);
    }

    @RequestMapping(value = "/api/product/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) {
        Product product = productService.findOne(id);

        if (product == null) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }


//    @RequestMapping(value = "/api/products",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Collection<Product>> getAllProducts() {
//        Collection<Product> products = productService.findAll();
//
//        return new ResponseEntity<Product>(products, HttpStatus.OK);
//    }
}
