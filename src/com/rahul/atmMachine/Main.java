package com.rahul.atmMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.print("Enter your pin: ");
        int pinEntered = sc.nextInt();

        if (atm.pinVerify(pinEntered)) {
            System.out.println("login successful");

            int choice;
            do {
                System.out.println("--ATM menu--");
                System.out.println("1. check balance");
                System.out.println("2. deposit money");
                System.out.println("3. withdraw money");
                System.out.println("4. Change PIN");
                System.out.println("5. exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: $");
                        int depositAmount = sc.nextInt();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: $");
                        int withdrawAmount = sc.nextInt();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.print("Enter old pin ");
                        int oldPin = sc.nextInt();
                        System.out.print("Enter new pin ");
                        int newPin = sc.nextInt();
                        System.out.print("Enter confirm pin ");
                        int confirmPin = sc.nextInt();
                        atm.changePin(oldPin, newPin, confirmPin);
                        break;
                    case 5:
                        System.out.println("Thanks for using our atm");
                }
            } while (choice != 5);
        } else {
            System.out.println("incorrect pin");
        }
    }
}