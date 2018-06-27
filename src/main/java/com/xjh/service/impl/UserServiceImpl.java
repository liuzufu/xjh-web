package com.xjh.service.impl;

import com.xjh.entity.User;
import com.xjh.repository.UserRepository;
import com.xjh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

}
