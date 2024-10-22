package com.food.food_delivery.Service;

import com.food.food_delivery.Model.UserModel;
import com.food.food_delivery.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserRepository userrepo;

    public List<UserModel> getallusers() {
        return userrepo.findAll();
    }
    public UserModel saveUser(UserModel userModel) {
        return userrepo.save(userModel);
    }
}
