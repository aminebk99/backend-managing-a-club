package com.example.websiteclubbackend.User.userWebService;

import org.springframework.web.bind.annotation.*;
import com.example.websiteclubbackend.User.user.User;
import com.example.websiteclubbackend.User.userService.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserWebService {
    private final UserService userService;

    public UserWebService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getalluser")
    public List<User> getAllUser(){
        return userService.getUser();
    }
    @GetMapping("getuserid/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    @PostMapping("/saveuser")
        public User saveuser(@RequestBody User user){
        return userService.saveUser(user);
        }

}
