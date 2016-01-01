package com.shop.Controller;

import com.shop.Model.Customer;
import com.shop.Service.CustomerService;
import com.shop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by bymot on 22.12.2015.
 */
@Controller
public class HomeController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;
    
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String home(ModelMap model) {
        model.addAttribute("products", productService.findAll());

        return "index";
    }
}
