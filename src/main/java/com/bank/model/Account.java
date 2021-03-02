package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "account_number")
    private String accountNumber;
    @Enumerated(EnumType.STRING)
    private Currencies currency;
    private double balance;
    @Column(name = "is_active")
    private boolean isActive;
    @ManyToOne
    private User user;

    public enum Currencies {
        UAH,
        USD,
        EUR
    }
}
