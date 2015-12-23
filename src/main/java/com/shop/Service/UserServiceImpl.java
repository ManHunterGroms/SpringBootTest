package com.shop.Service;

import com.shop.DAO.UserDao;
import com.shop.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by bymot on 22.12.2015.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User create(User user) {
        if(user.getId() != null) {
            return null;
        }

        User saveUser = new User();
        saveUser.setEmail(user.getEmail());
        saveUser.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userDao.save(saveUser);
    }

    @Override
    public User findUserById(long id) {
        User user = userDao.findOne(id);
        return user;
    }

    @Override
    public User findUserByEmail(String email) {
        return userDao.findOneByEmail(email);
    }

    @Override
    public Collection<User> getAllUsers() {
        return userDao.findAll();
    }
}
