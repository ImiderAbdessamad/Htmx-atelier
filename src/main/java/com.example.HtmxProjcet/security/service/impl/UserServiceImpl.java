package com.example.HtmxProjcet.security.service.impl;


import com.example.HtmxProjcet.security.bean.Role;
import com.example.HtmxProjcet.security.bean.User;
import com.example.HtmxProjcet.security.dao.RoleDao;
import com.example.HtmxProjcet.security.dao.UserDao;
import com.example.HtmxProjcet.security.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomPassword(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created record");
        roleDao.save(userRole);



        User adminUser = new User();
        adminUser.setUserName("admin");
        adminUser.setUserPassword(getEncodedPassword("admin"));
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setEmail("admin@gmail.com");
        adminUser.setPhoneNumber("0655889977");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);


    }

    public User registerNewUser(User user) {
        Role role = roleDao.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));

        return userDao.save(user);
    }

    @Override
    public User update(User user) {
         User user1 = userDao.findById(user.getUserName()).get();
         if (user1==null) return null;
         user1.setEmail(user.getEmail());
         user1.setPhoneNumber(user.getPhoneNumber());
         user1.setUserFirstName(user.getUserFirstName());
         user1.setUserLastName(user.getUserLastName());
         user1.setUserPassword(getEncodedPassword(user.getUserPassword()));
        Set<Role>roles = new HashSet<>();
        user.getRole().forEach(role -> {
            roles.add( roleDao.findById(role.getRoleName()).get());
        });
        user1.setRole(roles);
        userDao.save(user1);
        return user1;
    }

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;




    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}