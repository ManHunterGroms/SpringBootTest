package com.shop.Service;

import com.shop.DAO.StatusDao;
import com.shop.Model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by bymot on 29.12.2015.
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusDao statusDao;

    @Override
    public Status create(Status status) {
        return statusDao.save(status);
    }

    @Override
    public Status findStatusById(long id) {
        return statusDao.findOne(id);
    }

    @Override
    public Collection<Status> getAllStatus() {
        return statusDao.findAll();
    }
}
