package com.bank.service;

import com.bank.model.Role;

public interface RoleService {
    Role save(Role role);

    Role getByName(String name);
}
