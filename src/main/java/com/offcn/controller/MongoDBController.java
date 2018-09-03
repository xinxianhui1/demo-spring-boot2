package com.offcn.controller;

import com.offcn.dao.UserRepository;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/mongo")
public class MongoDBController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        //findAll方法就是MongoRepository默认实现的
        List<User> all = userRepository.findAll();
        return all;
    }

    @GetMapping("/findByUcode/{ucode}")
    public User findByUcode(@PathVariable String ucode){
        User user = userRepository.findByUcode(ucode);
        return user;
    }

    @PostMapping("/save")
    public void save(User user){
        userRepository.insert(user);
    }
}