package com.company;
import java.util.Scanner;

public class BankJava {
    double balance=0;
    double amount=0;
    public void withdraw(int amount) {
        balance = balance - amount;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }
    public double showBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankJava bank = new BankJava();
        Scanner input = new Scanner(System.in);
        int action;
        int amount;
        do{
            System.out.println("Choose Action: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            action = input.nextInt();
            switch(action){
                case 1 :
                    System.out.println("Enter amount:");
                    amount = input.nextInt();
                    bank.deposit(amount);
                    System.out.println("\n");
                    System.out.println("Your balance is now: " + bank.showBalance());
                    break;
                case 2 :
                    System.out.println("Enter amount:");
                    amount = input.nextInt();
                    bank.withdraw(amount);
                    System.out.println("\n");
                    System.out.println("Your balance is now: " + bank.showBalance());
                    break;
                case 3 :
                    System.out.println("Your balance is: " + bank.showBalance());
                    System.out.println("\n");
                    break;
                case 4 :
                    System.out.println("Thank you!");
                    break;
                default :
                    System.out.println("Invalid!");
                    break;
            }
        }while(action != 4);

    }
}