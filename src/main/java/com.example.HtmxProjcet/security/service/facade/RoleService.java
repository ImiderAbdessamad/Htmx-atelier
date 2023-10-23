package com.example.HtmxProjcet.security.service.facade;


import com.example.HtmxProjcet.security.bean.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();


    int update(Role role);
}