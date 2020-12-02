package com.company;
import java.util.Scanner;

public class Large_N {
    public static void main(String[] args){
        int n=11, i, max;
        int []num =new int[100];
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 10 number: ");
        for(i=1; i<n; i++){
            num[i]=in.nextInt();
        }
        max=num[1];
        for(i=1; i<n; i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.printf("The large number is %d",max);
    }
}
