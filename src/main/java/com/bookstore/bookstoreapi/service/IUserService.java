package com.bookstore.bookstoreapi.service;

import com.bookstore.bookstoreapi.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {

    User saveUser(User user);

    Optional<User> findByUsername(String name);

    void makeAdmin(String username);
}
