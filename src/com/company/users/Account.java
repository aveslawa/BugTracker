package com.company.entities;

import com.company.users.AccountType;

/**
 * Created by Viachaslau.
 */
public abstract class Account {
    private long id;
    private AccountType accountType;

    public Account(AccountType accountType) {
        this.accountType = accountType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountType=" + accountType +
                '}';
    }
}
