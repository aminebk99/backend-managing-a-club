package com.example.websiteclubbackend.User.userRepo;

import com.example.websiteclubbackend.User.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
