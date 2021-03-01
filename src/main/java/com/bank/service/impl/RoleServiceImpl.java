package com.bank.service.impl;

import com.bank.model.Role;
import com.bank.repository.RoleRepository;
import com.bank.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;

    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public Role getByName(String name) {
        return repository.getByName(name).orElseThrow(RuntimeException::new);
    }
}
