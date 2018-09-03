package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
    public User findByUcode(String ucode);
}