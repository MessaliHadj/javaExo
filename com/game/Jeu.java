package com.game;
import java.util.List;

public abstract class Jeu {

    public abstract void lancerDes();
    
    public void players(String msg){
        System.out.println("Ce jeux se joue jusqu'à "+msg+" personnes");
    };

    public void win(String msg){
        System.out.println("Vous avez gagné " +msg);
    };

    public void game(String msg){
        System.out.println("Ceci est un jeu " +msg);
    };
}