package com.restapi.com.Bpay.model;


import jakarta.persistence.*;

@Entity
@Table(name ="BpayUser")
public class MdlBpayUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String username;
    String email;
    String password;
    String fullname;
    long accountNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public MdlBpayUser(int id, String username, String email, String password, String fullname, long accountNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.accountNumber = accountNumber;
    }

    public MdlBpayUser() {
    }

    @Override
    public String toString() {
        return "MDL_BpayUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
