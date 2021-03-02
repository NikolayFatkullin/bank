package com.bank.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "account_from", unique = true)
    private Account accountFrom;
    @ManyToOne
    @JoinColumn(name = "account_to")
    private Account accountTo;
    private double amount;
    private LocalDateTime localDateTime;
    @Enumerated(EnumType.STRING)
    private Types type;

    public enum Types {
        INCOMING,
        OUTCOMING
    }
}
