package com.shop.Controller;

import com.shop.Model.User;
import com.shop.Service.AddressService;
import com.shop.Service.CustomerService;
import com.shop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bymot on 29.12.2015.
 */
@Controller
@RequestMapping(value = "/profile")
public class ProfileController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String profile(ModelMap model) {
        model.addAttribute("customer", customerService.getCurrentCustomer());
        return "profile";
    }
}
