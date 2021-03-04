package com.bank.service.impl;

import com.bank.model.Account;
import com.bank.model.Transaction;
import com.bank.repository.TransactionRepository;
import com.bank.service.TransactionService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getAllByAccount(Account account, int page, int size) {
        PageRequest pageable = PageRequest.of(page, size, Sort.by("date").descending()
                .and(Sort.by("id")));
        return transactionRepository.getAllByAccount(pageable, account);
    }
}
