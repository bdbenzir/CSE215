package com.company;

import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args){
        int[] num= new int[100];
        int i, n, max, min;
        Scanner in=new Scanner(System.in);
        System.out.printf("What do you want to check?\n1. MAXIMUM\n2. MINIMUM ");
        int ck=in.nextInt();
        if(ck==1 || ck==2) {
            continue;
        }
        System.out.printf("How many numbers you want to check: ");
        n=in.nextInt();
        for(i=1; i<=n; i++){
            System.out.printf("Enter %d: ");
            num[i]=in.nextInt();
        }
        if(ck==1){
            max=num[1];
            for(i=1; i<=10; i++){
                if(num[i]>max){
                    max=num[i];
                }
            }
            System.out.printf("The maximum number is %d",max);
        }
        else if(ck==2){
            min=num[1];
            for(i=1; i<=n; i++){
                if(min<num[i]) {
                    min = num[i];
                }
            }
        }
    }
    public void max(int num[]){
        int i, n, max;
        for(i=0; i<=n; i++){
            max=num[1];
            if(i=0)
        }
    }
}