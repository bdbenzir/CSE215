//Benzir Ahammed Shawon 1922270042
package com.company;
import java.util.Scanner;
public class CricketTeam {
    int i, n;
    int win=0, loss=0, noplayer=0;
    public void increaseWin(int n){
        win=win+n;
    }
    public void increaseLoses(int n){
        loss=loss+n;
    }
    public String toString() {
        return ("Team data: "+CricketTea()+ "Wins: " + win " Loss:"+loss);
    }
    public void CricketTea(int noplayer){
        for(int i=0;i<noplayer;i++)
        {
            Scanner br= new Scanner(System.in);
            System.out.println("Enter Team Name: ");
            String name=br.nextLine();
            System.out.println("Enter Team City: ");
            String cityname=br.nextLine();
            System.out.println("Enter Team Coach Name: ");
            String coachname=br.nextLine();
            System.out.println("Enter Numbers of Payers: ");
            int pnum=br.nextInt();
        }
    }
    public void Coach(){
        Scanner br= new Scanner(System.in);
        System.out.println("Enter Coach Name: ");
        String name=br.nextLine();
        System.out.println("Enter Coach Hometown: ");
        String cityname=br.nextLine();
        System.out.println("Enter Age: ");
        int age=br.nextInt();
    }
    public static void main(String[] args){
        Scanner br= new Scanner(System.in);
        System.out.println("Enter number of teams: ");
        int noplayer=br.nextInt();
    }
}
