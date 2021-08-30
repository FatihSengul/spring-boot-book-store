package com.bookstore.bookstoreapi.controller;

import com.bookstore.bookstoreapi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/internal")//pre-path
public class InternalApiController {


    private final IUserService userService;

    public InternalApiController(IUserService userService) {
        this.userService = userService;
    }

    @PutMapping("make-admin/{username}") //api/internal/make-admin/{username}
    public ResponseEntity<?> makeAdmin(@PathVariable String username) {
        userService.makeAdmin(username);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}