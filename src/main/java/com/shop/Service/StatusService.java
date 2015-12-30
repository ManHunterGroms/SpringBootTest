package com.shop.Service;


import com.shop.Model.Status;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
public interface StatusService {

    Status create(Status status);
    Status findStatusById(long id);
    Collection<Status> getAllStatus();
}
