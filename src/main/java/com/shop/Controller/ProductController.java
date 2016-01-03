package com.shop.Controller;

import com.shop.Service.CategoryService;
import com.shop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.keygen.StringKeyGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bymot on 02.01.2016.
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
    public String getProducts(@RequestParam(value = "page", defaultValue = "1", required = false) int page,
                              @RequestParam(value = "size", defaultValue = "5", required = false) int size,
                              @RequestParam(value = "categorySelected", defaultValue = "0", required = false) int category,
                              @RequestParam(value = "sort", defaultValue = "0", required = false) int sort,
                              ModelMap model) {
        model.addAttribute("products", productService.findAll(new PageRequest(page-1, size)).getContent());
        model.addAttribute("page", page);
        model.addAttribute("size", size);

        if(category != 0) model.addAttribute("categorySelected", category);
        if(sort != 0) model.addAttribute("sort", sort );

        model.addAttribute("totalPage", productService.count());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "products";
    }
}
