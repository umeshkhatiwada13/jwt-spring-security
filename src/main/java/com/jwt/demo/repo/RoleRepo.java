package com.jwt.demo.repo;

import com.jwt.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
