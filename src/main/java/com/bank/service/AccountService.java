package com.bank.service;

import com.bank.model.Account;
import java.util.Optional;

public interface AccountService {
    Account save(Account account);

    Optional<Account> getById(Long id);

    void delete(Account account);

}
