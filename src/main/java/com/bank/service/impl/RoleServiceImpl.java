package com.bank.service.impl;

import com.bank.model.Role;
import com.bank.repository.RoleRepository;
import com.bank.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;

    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public Role getByName(String name) {
        return repository.getByName(name).orElseThrow(RuntimeException::new);
    }
}
