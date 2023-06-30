package com.game;
import java.util.List;

public interface Quiz extends Winable{
    public void quiz(String msg);

    public List<Question> questions;
    
    public Question tireQuestion(int index);

}
