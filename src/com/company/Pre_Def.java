package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
public class Pre_Def {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=in.nextInt();
        System.out.println("Enter the power number: ");
        int p=in.nextInt();
        int pe= (int) Math.pow(n,p);
        System.out.printf("%d^%d equal %d\n",n,p,pe);
        int sqt= (int) Math.sqrt(pe);
        System.out.printf("Square root of %d id %d\n",pe,sqt);
        System.out.println("Enter two number to find larger: ");
        int mx=in.nextInt();
        int mx2=in.nextInt();
        int max=(int) Math.max(mx,mx2);
        System.out.printf("Larger number is %d\n",max);
        System.out.printf("COS, SIN and TAN of max number is %d, %d and %d\n",(int)Math.cos(max),(int)Math.sin(max),(int)Math.tan(max));
        System.out.println("To make a letter UPPERCASE input that: ");
        char ch=in.next().charAt(0);
        ch=(char) Character.toUpperCase(ch);
        System.out.printf("Uppercase result: %c\n",ch);
        System.out.println("To make a letter lowercase input that: ");
        char chl=in.next().charAt(0);
        chl=(char) Character.toLowerCase(chl);
        System.out.printf("Lowercase result: %c\n",chl);

    }
}
