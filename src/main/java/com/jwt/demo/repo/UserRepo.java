package com.jwt.demo.repo;

import com.jwt.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
