package com.security.demospringsecurity.service;

import com.security.demospringsecurity.model.Role;
import com.security.demospringsecurity.model.RoleName;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RoleService {
    Optional<Role> findByName(RoleName roleName);
}
