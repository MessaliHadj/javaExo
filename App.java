import com.game.*;
import java.util.ArrayList;
import java.util.List;
/**
 * App
 */
public class App {

    public static void main(String[] args) {
        
        Jeu[] mesJeux = {new Monopoly(), new TribialPoursuite()};

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Qui a la priorité dans une intersection ?"));
        CodeDeLaRoute codeDeLaRoute = new CodeDeLaRoute(questions);
        System.out.println(codeDeLaRoute.tireQuestion(0).getQuestion());

        List<Question> questions2 = new ArrayList<>();
        questions2.add(new Question("Quelle est la capitale de la France ?"));
        // mesJeux[1].tireQuestion(0).getQuestion();
        System.out.println(mesJeux[1].tireQuestion(0).getQuestion());

        mesJeux[0].game("Super Jeu Monopoly");
        mesJeux[0].players("6");
        mesJeux[0].win("100000 euros");
        mesJeux[0].lancerDes();
        
        // trivialPoursuit.game("TrivialPursuit");
        // trivialPoursuit1.game("TrivialPursuit");
        // trivialPoursuit2.game("TrivialPursuit");
        // trivialPoursuit3.game("TrivialPursuit");
        // trivialPoursuit.quiz("Superbe quiz");
        // trivialPoursuit.win("Bravo !");

        String message = "Dommage";
        String messageuh = "Ceci est un examen";
        codeDeLaRoute.win(message);
        codeDeLaRoute.quiz(messageuh);

    
    }
}