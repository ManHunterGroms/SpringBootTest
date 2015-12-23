package com.shop.Controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String home() {
        return "index";
    }
}
