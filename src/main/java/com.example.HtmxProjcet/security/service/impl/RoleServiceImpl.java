package com.example.HtmxProjcet.security.service.impl;


import com.example.HtmxProjcet.security.bean.Role;
import com.example.HtmxProjcet.security.dao.RoleDao;
import com.example.HtmxProjcet.security.service.facade.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
@Autowired
   private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }


    @Override
    public int update(Role role) {
        roleDao.save(role);

        return 1;
    }


    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }


}