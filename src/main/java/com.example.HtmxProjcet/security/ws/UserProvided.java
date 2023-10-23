package com.example.HtmxProjcet.security.ws;


import com.example.HtmxProjcet.security.bean.User;
import com.example.HtmxProjcet.security.service.facade.UserService;
import com.example.HtmxProjcet.security.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.mail.MessagingException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserProvided {
    @Autowired
    private UserService userService;
    @Autowired
    private UserServiceImpl userServiceImpl;

        @PostConstruct
        public void initRoleAndUser() {
        userServiceImpl.initRoleAndUser();
        }

        @PostMapping({"/registerNewUser"})
        public User registerNewUser(@RequestBody User user) {
            return userServiceImpl.registerNewUser(user);
        }


        @PutMapping("/")
        @PreAuthorize("hasRole('Admin')")
        public User update(@RequestBody User user) {
        return userService.update(user);
    }

        @GetMapping({"/"})
        public List<User> findAll() {
        return userServiceImpl.findAll();
    }
}