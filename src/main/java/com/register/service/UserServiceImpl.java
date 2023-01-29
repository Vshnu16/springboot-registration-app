package com.register.service;


import com.register.entity.User;
import com.register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public void registerUser(User user) {
        repo.save(user);
    }
}
