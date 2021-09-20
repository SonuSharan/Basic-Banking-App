package com.example.bbsbank.Data;
public class Users {
    private String name;
    private int accountNumber;
    private String phoneNumber;
    private String ifscCode;
    private int balance;
    private String email;

    public Users(String name, int accountNumber, String phoneNumber, String ifscCode, int balance, String email) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.ifscCode = ifscCode;
        this.balance = balance;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public int getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
