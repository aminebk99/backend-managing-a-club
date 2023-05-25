package com.example.websiteclubbackend.User.userService;

import com.example.websiteclubbackend.User.user.User;
import com.example.websiteclubbackend.User.userRepo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public List<User> getUser(){
        return userRepo.findAll();
    }
    public Optional<User> getUserById(Long id){
        return userRepo.findById(id);
    }
    public User saveUser(User user){
        return userRepo.save(user);
    }
    public User updateUser(User user){
        return this.userRepo.save(user);
    }
}
