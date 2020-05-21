package com.security.demospringsecurity.service.Impl;

import com.security.demospringsecurity.model.Role;
import com.security.demospringsecurity.model.RoleName;
import com.security.demospringsecurity.repository.RoleRepository;
import com.security.demospringsecurity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(RoleName roleName) {
        return roleRepository.findByName(roleName);
    }
}
