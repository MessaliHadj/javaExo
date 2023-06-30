package com.game;
// import java.util.List;

public class CodeDeLaRoute extends Jeu implements Quiz{
    public void quiz(String msg){
        System.out.println("ceci est un quizz" + msg);
    }
    public void win(String msg){
        System.out.println("Vous avez Gagné/Perdu !!" + msg);
    }

    public Question(int index){
        return questions.get(index);
    }

    // public List<Question> questions;
    // // champs
    // public CodeDeLaRoute(List<Question> questions){
    //     this.questions = questions;
    // }
    // // constructeur
    // public Question tireQuestion(int index){
    //     return questions.get(index);
    // }
    // // méthode
}
