package com.company;
import java.util.Scanner;
public class Main {

        static int putSum(int n)
        {
            int sum = 0;
            while (n != 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }
            return sum;
        }

        public static void main(String[] args)
        {
            Scanner in= new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = in.nextInt();

            System.out.println(putSum(n));
        }
    }

