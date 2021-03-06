package com.bank.service.impl;

import com.bank.model.User;
import com.bank.repository.UserRepository;
import com.bank.service.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User getById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User getByPhoneNumber(String phoneNumber) {
        return repository.getByPhoneNumber(phoneNumber);
    }
}
