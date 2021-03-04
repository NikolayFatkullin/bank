package com.bank.service;

import com.bank.model.Account;
import com.bank.model.Transaction;
import java.util.List;

public interface TransactionService {
    List<Transaction> getAllByAccount(Account account, int page, int size);
}
