package com.example.HtmxProjcet.security.ws;


import com.example.HtmxProjcet.security.bean.Role;
import com.example.HtmxProjcet.security.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleProvided {
    @Autowired
    private RoleServiceImpl roleService;

    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }
}