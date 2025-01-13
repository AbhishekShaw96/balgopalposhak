package com.balgopalposhak.user_service.controller;

import com.balgopalposhak.user_service.dto.UserDTO;
import com.balgopalposhak.user_service.model.User;
import com.balgopalposhak.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserRest {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }
}
