package com.bank.service.impl;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;
import com.bank.service.AccountService;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Optional<Account> getById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public void delete(Account account) {
        accountRepository.delete(account);
    }
}
