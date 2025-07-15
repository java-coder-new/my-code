package com.rahul.atmMachine;

public class ATM {
    private int pin = 1234;
    private int balance = 10000;

    boolean pinVerify(int pinEntered) {
        return pinEntered == pin;
    }

    void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
    void deposit (int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount+ " deposit successfully.");
        } else {
            System.out.println("invalid amount");
        }
    }
    void withdraw (int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdraw successfully");
        } else {
            System.out.println("insufficient balance.");
        }
    }
    void changePin (int oldPin , int newPin , int confirmPin) {
        if (oldPin != pin) {
            System.out.println("Incorrect pin");
            return;
        } if (newPin != confirmPin) {
            System.out.println("pin do not match");
            return;
        }
        pin = newPin;
        System.out.println("pin change successfully");
    }
}
