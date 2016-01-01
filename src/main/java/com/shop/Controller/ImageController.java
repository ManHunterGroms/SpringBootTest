package com.shop.Controller;

import com.shop.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by bymot on 01.01.2016.
 */
@Controller
@RequestMapping(value = "/image")
public class ImageController {

    @RequestMapping(value = "/product/{imageName:.+}", method = RequestMethod.GET)
    public void getProductImage(HttpServletResponse response,
                                HttpServletRequest request,
                                @PathVariable String imageName) {
        String rootPath = request.getServletContext().getRealPath("/");
        String fullPath = rootPath + File.separator + "tmpFiles" + File.separator + imageName;


        try {
            FileInputStream inputStream = new FileInputStream(fullPath);

            response.setContentType("image/jpg");
            response.setHeader("Content-disposition", "attachment; filename=\"" + imageName + "\"");

            FileCopyUtils.copy(inputStream, response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
