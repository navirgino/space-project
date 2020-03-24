package com.space.project.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import javax.validation.Valid;
//
//
//@Controller
//public class UserController {
//    @Autowired
//    private UserRepository userDao;
//
//    //create user here
//    public void saveUser(@Valid User user, Errors validation, Model m){
//        String username = user.getUsername();
//        User existingUsername = userDao.findByUsername(username);
//        User existingEmail = userDao.findByEmail(user.getEmail());
//
//    }
//}
