package com.shop.Service;

import com.shop.DAO.ImageDao;
import com.shop.Model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageDao imageDao;

    @Override
    public Image create(Image image) {
        return imageDao.save(image);
    }

    @Override
    public Image findImageById(long id) {
        return imageDao.findOne(id);
    }

    @Override
    public Collection<Image> getAllImages() {
        return imageDao.findAll();
    }
}
