package com.shop.Controller;

import com.shop.Model.Customer;
import com.shop.Model.User;
import com.shop.Service.CustomerService;
import com.shop.Service.UserService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by bymot on 23.12.2015.
 */
@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String newUser(ModelMap model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "registration";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String register(@Valid Customer customer,
                           BindingResult result) {
        if(result.hasErrors()) {
            return "registration";
        }

        User user = new User();
        user.setEmail(customer.getUser().getEmail());
        user.setPassword(customer.getUser().getPassword());
        user = userService.create(user);
        customer.setUser(user);
        customerService.create(customer);

        return "redirect:/";
    }

}
