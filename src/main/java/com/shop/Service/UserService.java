package com.shop.Service;

import com.shop.Model.User;

import java.util.Collection;

/**
 * Created by bymot on 22.12.2015.
 */
public interface UserService {
    User create(User user);
    User findUserById(long id);
    User findUserByEmail(String email);
    Collection<User> getAllUsers();
    User getCurrentUser();
}
