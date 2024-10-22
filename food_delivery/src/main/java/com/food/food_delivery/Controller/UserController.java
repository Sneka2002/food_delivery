package com.food.food_delivery.Controller;

import com.food.food_delivery.Model.UserModel;
import com.food.food_delivery.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userserv;

    @GetMapping(path = "/getAll")
    public List<UserModel> getAllUsers() {
        return userserv.getallusers();
    }

    @PostMapping(path = "/save")
    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel userModel) {
        UserModel savedUser = userserv.saveUser(userModel);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

    }
}
