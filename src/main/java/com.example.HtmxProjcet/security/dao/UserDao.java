package com.example.HtmxProjcet.security.dao;



import com.example.HtmxProjcet.security.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, String> {


}