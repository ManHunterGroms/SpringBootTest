package com.shop.Controller;

import com.shop.Model.Image;
import com.shop.Model.Product;
import com.shop.Service.CategoryService;
import com.shop.Service.ImageService;
import com.shop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bymot on 31.12.2015.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ImageService imageService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String adminHome() {
        return "admin/index";
    }

    @RequestMapping(value = "/add_product", method = RequestMethod.GET)
    public String addProduct(ModelMap model) {
        Product product = new Product();
        model.addAttribute("product", product);
        model.addAttribute("categories", categoryService.getAllCategories());
        return "admin/add_product";
    }

    @RequestMapping(value = "/add_product", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute Product product,
                              @RequestParam("image_files[]") MultipartFile[] multipartFiles,
                              HttpServletRequest request) {
        List<String> fileNames = new ArrayList<>();

        if(!multipartFiles[0].isEmpty()) {
            for(int i = 0; i < multipartFiles.length; i++) {
                MultipartFile file = multipartFiles[i];
                fileNames.add(file.getOriginalFilename());
                try {
                    byte[] bytes = file.getBytes();
                    String rootPath = request.getServletContext().getRealPath("/");
                    File dir = new File(rootPath + File.separator + "tmpFiles");

                    if (!dir.exists())
                        dir.mkdirs();

                    File serverFile =
                            new File(dir.getAbsolutePath() +
                                    File.separator +
                                    file.getOriginalFilename());

                    BufferedOutputStream stream =
                            new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    return "You failed to upload " + " => " + e.getMessage();
                }
            }
        }

        Product saveProduct = productService.create(product);

        for (int i = 0; i < fileNames.size(); i++) {
            Image image = new Image();
            image.setProduct(saveProduct);
            image.setImageUrl(fileNames.get(i));
            imageService.create(image);
        }

        return "redirect:/admin";
    }
}
