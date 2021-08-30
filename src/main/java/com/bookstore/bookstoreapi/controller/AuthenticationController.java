package com.bookstore.bookstoreapi.controller;

import com.bookstore.bookstoreapi.model.User;
import com.bookstore.bookstoreapi.service.IAuthenticationService;
import com.bookstore.bookstoreapi.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authentication")//pre-path
public class AuthenticationController {

    private final IAuthenticationService authenticationService;

    private final IUserService userService;

    public AuthenticationController(IAuthenticationService authenticationService, IUserService userService) {
        this.authenticationService = authenticationService;
        this.userService = userService;
    }

    @PostMapping("sign-up") //api/authentication/sign-up
    public ResponseEntity<?> signUp(@RequestBody User user) {
        if (userService.findByUsername(user.getUsername()).isPresent()) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @PostMapping("sign-in")//api/authentication/sign-in
    public ResponseEntity<?> signIn(@RequestBody User user) {
        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);
    }
}