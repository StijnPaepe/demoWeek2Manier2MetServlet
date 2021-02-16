package domain.model;

import java.util.Random;

public class GuessGame {
    private int number = thinkNumber();
    public String guess(int guessedNumber){
        String message = null;
        if(guessedNumber == number){
            message="Goed gedaan! Dat was het juiste getal!";
            number = thinkNumber();
        }
        else if (guessedNumber > number){
            message = "Lager...";
        }
        else{
            message = "Hoger...";
        }
        return message;
    }

    private int thinkNumber(){
        return new Random().nextInt(10) + 1;
    }
}
