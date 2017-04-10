package com.company.entities;

import com.company.users.Account;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viachaslau.
 */


public class User implements Serializable {
    private long id;
    private String username;
    private String fullName;
    private Account activeAccount;
    private List<Account> accounts = new ArrayList<>();
    private String email;
    private String group;

    public User(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public User(long id, String username, String fullName, String email, String group) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.group = group;

    }

    public Account getActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(Account activeAccount) {
        this.activeAccount = activeAccount;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != user.getId()) return false;
        if (getUsername() != null ? !getUsername().equals(user.getUsername()) : user.getUsername() != null)
            return false;
        if (getFullName() != null ? !getFullName().equals(user.getFullName()) : user.getFullName() != null)
            return false;
        if (getActiveAccount() != null ? !getActiveAccount().equals(user.getActiveAccount()) : user.getActiveAccount() != null)
            return false;
        if (getAccounts() != null ? !getAccounts().equals(user.getAccounts()) : user.getAccounts() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(user.getEmail()) : user.getEmail() != null) return false;
        return getGroup() != null ? getGroup().equals(user.getGroup()) : user.getGroup() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getFullName() != null ? getFullName().hashCode() : 0);
        result = 31 * result + (getActiveAccount() != null ? getActiveAccount().hashCode() : 0);
        result = 31 * result + (getAccounts() != null ? getAccounts().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getGroup() != null ? getGroup().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", activeAccount=" + activeAccount +
                ", accounts=" + accounts +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
