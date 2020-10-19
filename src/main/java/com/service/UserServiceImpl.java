package com.service;

import com.model.UserEntity;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserEntity saveUser(UserEntity student) {
        UserEntity userResponse = userRepository.save(student);
        return userResponse;
    }

    @Override
    @Transactional(readOnly = true)
    public UserEntity getUser(int id) {
        Optional<UserEntity> studentResponse =  userRepository.findById(id);
        UserEntity userResponse = studentResponse.get();
        return userResponse;
    }
}
