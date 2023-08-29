package com.unceentech.bondpay.Apis;

import com.unceentech.bondpay.Models.User;
import com.unceentech.bondpay.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserServices userService;

    @GetMapping("get")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("get/{userId}") //inject the value of userId into the parameter id
    public Optional<User> getUser(@PathVariable("userId") Long id){
        return userService.getUser(id);
    }

    @PostMapping("create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }


}
