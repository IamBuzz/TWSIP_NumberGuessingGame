import java.util.Random;
import java.util.Scanner;

public class Diff {
    Scanner scan = new Scanner(System.in);
    int guessCount;
    Random rnd = new Random();
    Diff(int guessCount){this.guessCount = guessCount;}
    public void guessIt(int maxRange){

        boolean isGuessCorrect = false;
        int randomInRange = rnd.nextInt(maxRange) + 1;

        while (!isGuessCorrect&&this.guessCount!=0){
            int guess;
            System.out.println("#You have "+guessCount+" guess..");
            System.out.print("**Enter your guess:");
            guess = scan.nextInt();
            if(guess>maxRange){
                System.out.println("Your Guess is out of Range..");
            }
            else{
                if(guess==randomInRange){
                    isGuessCorrect = true;
                    System.out.println("Congratulations!! You Won..");
                } else if (guess < randomInRange) {
                    System.out.println("Your Guess is little Low. Try Higher!!!");
                }else {
                    System.out.println("Your Guess is little High. Try Lower!!!");
                }
                this.guessCount--;
            }
        }
        if(this.guessCount==0){
            System.out.println("#You have "+this.guessCount+" guess..");
            System.out.println("#You're out of guesses!!");
            System.out.println("You Lose..");
        }
    }
}
