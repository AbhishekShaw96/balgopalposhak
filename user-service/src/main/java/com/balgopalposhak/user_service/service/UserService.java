package com.balgopalposhak.user_service.service;

import com.balgopalposhak.user_service.dto.UserDTO;
import com.balgopalposhak.user_service.model.User;

public interface UserService {

	User saveUser(UserDTO userDTO);

	User updateUser(UserDTO userDTO);

}
