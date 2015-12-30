package com.shop.Service;

import com.shop.Model.Image;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
public interface ImageService {

    Image create(Image image);
    Image findImageById(long id);
    Collection<Image> getAllImages();
}
