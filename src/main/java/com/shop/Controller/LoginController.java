package com.shop.Controller;

import com.shop.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by bymot on 23.12.2015.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView login() {
        User user = new User();
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject(user);
        return modelAndView;
    }
}
