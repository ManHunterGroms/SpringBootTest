package com.shop.DAO;

import com.shop.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bymot on 22.12.2015.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
}
