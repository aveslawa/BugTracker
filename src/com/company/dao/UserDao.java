package com.company.dao;

import com.company.entities.User;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

/**
 * Created by Viachaslau.
 */
public interface UserDao {
    User save (User user);
    User update (User user);
    User saveOrUpdate (User user);
    void delete (long userId);
    User find (long userId);
    List<User> findAll ();
    User findByName (String userName) throws UserPrincipalNotFoundException;
}
