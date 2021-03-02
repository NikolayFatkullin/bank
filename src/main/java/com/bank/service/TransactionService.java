package com.bank.service;

import com.bank.model.Account;
import com.bank.model.Transaction;
import java.util.List;

public interface TransactionService {
    List<Transaction> getAllByAccount(int page, int size, Account account);
}
