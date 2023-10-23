package com.example.HtmxProjcet.security.dao;


import com.example.HtmxProjcet.security.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role,String> {

}