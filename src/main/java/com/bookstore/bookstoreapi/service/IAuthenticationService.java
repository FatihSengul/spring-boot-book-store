package com.bookstore.bookstoreapi.service;

import com.bookstore.bookstoreapi.model.User;

public interface IAuthenticationService {

    User signInAndReturnJWT(User signInRequest);
}
