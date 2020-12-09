//Benzir Ahammed Shawon 1922270042
package com.company;

public class Coach {
    public void increaseNumberOfGames(int n){
        int games=games+n;
        return games;
    }
    public String toString() {
        return ("Coach data: "+ new Coach() +"Number of games:" + increaseNumberOfGames());
}
