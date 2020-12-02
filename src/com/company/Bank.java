package com.company;
import java.util.Scanner;

    public class Bank {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter Initial Balance: ");
            float bal = in.nextInt();

            System.out.print("Enter Yearly Interest Rate: ");
            float intt = in.nextFloat();

            System.out.print("Enter Annual Fees: ");
            float anh = in.nextInt();

            System.out.print("Number of Years: ");
            int n = in.nextInt();

            for (int i = 1; i <= n; i++) {
                bal = bal + ((bal * (intt / 100)) - anh);

            }
            System.out.printf("Balance after %d years is %d",n,bal);
        }
    }