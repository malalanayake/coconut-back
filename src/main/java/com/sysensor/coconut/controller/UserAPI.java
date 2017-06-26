package com.sysensor.coconut.controller;

import com.sysensor.coconut.config.URLConfig;
import com.sysensor.coconut.entity.User;
import com.sysensor.coconut.repository.BaseRepository;
import com.sysensor.coconut.service.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(URLConfig.USER)
public class UserAPI{

    BaseService<User, BaseRepository<User>> userService;

    public UserAPI(BaseService<User, BaseRepository<User>> userService) {
        this.userService = userService;
    }

    @RequestMapping("/getAll")
    public List<User> getUsers() {
        return userService.getAll();
    }

    @RequestMapping("/add")
    public User create() throws Exception {
        User user = new User();
        user.setContextDate(LocalDate.now());
        user.setUserName("test");
        user.setPassWord("test");
        userService.create(user);
        return user;
    }
}
