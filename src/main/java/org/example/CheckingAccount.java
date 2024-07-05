package org.example;

public class CheckingAccount {
    private String name;
    private int balance;
    private String id;
    private double interestRate;

    public CheckingAccount(String inputName, int inputBalance, String inputId) {
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.interestRate = 0.02;
    }


    //getter method - Accessor
    public int getBalance() {
        return this.balance;
    }


    //setter method - mutator
    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public double getMonthlyInterest() {
        return this.interestRate * this.balance;
    }
}
