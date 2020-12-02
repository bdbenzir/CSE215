package com.company;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        String inp, rev = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string or number: ");
        inp = in.nextLine();
        int length = inp.length();
        for (int i = length - 1; i >= 0; i--)
            rev = rev + inp.charAt(i);
        if (inp.equals(rev))
            System.out.println("This string or number is a palindrome.");
        else
            System.out.println("This string or number isn't a palindrome.");
    }

}
