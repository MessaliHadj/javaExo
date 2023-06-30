package com.game;

public class Monopoly extends Jeu implements JeuSociete , Playable {
    int x = 7;

    public void lancerDes(){
        System.out.println("lancement de " + this.x + " des");
    };
}
