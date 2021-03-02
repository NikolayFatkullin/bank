package com.bank.repository;

import com.bank.model.Account;
import com.bank.model.Transaction;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("SELECT t FROM Transaction t LEFT JOIN FETCH t.accountFrom LEFT JOIN FETCH t.accountTo "
            + "WHERE t.accountTo = :account OR t.accountFrom = :account")
    List<Transaction> getAllByAccount(Pageable pageable, @Param("account") Account account);
}
