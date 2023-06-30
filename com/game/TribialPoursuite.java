package com.game;
// import java.util.List;

/**
 * TribialPoursuite
 */
public class TribialPoursuite extends Jeu implements Playable, JeuSociete, Quiz {
    int x = 3;

    // public List<Question> questions;
    // public TribialPoursuite(List<Question> questions){
    //     this.questions = questions;
    // }

    // public Question tireQuestion(int index){
    //     return questions.get(index);
    // }

    public Question(int index){
        return questions.get(index);
    }
    
    public void quiz(String msg){
        System.out.println("ceci est un quizz " + msg);
    }


    public void lancerDes(){
        System.out.println("lancement de " + this.x + " des");
    }
}