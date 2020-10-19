package com.service;

import com.model.UserEntity;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    public UserEntity saveUser(UserEntity student);

    public UserEntity getUser(int id);
}
