package com.microservice.producer;

import com.model.UserEntity;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

  @RequestMapping(method = RequestMethod.POST,  value = "/save")
  @ResponseBody
    public UserEntity save(@RequestBody UserEntity user) {
      UserEntity userResponse = (UserEntity) userService.saveUser(user);
      return userResponse;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserEntity getUser(@PathVariable int id) {
        UserEntity studentResponse = (UserEntity) userService.getUser(id);
        return studentResponse;
    }

}

