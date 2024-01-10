import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int noOfGuesses;
        System.out.println("Welcome to the Number Guessing Game..");
        do{
            System.out.println("**Select the Difficulty Level**");
            System.out.println("1.Easy");
            System.out.println("2.Moderate");
            System.out.println("3.Hard");
            System.out.println("4.Pro");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");;
            choice = scan.nextInt();


            switch (choice) {
                case 1 -> {
                    System.out.println("**Easy**");
                    System.out.println("Guess the Number (1-10)");
                    Diff easy = new Diff(3);
                    easy.guessIt(10);
                }
                case 2 -> {
                    System.out.println("**Moderate**");
                    System.out.println("Guess the Number (1-50)");
                    Diff Moderate = new Diff(7);
                    Moderate.guessIt(50);
                }
                case 3 -> {
                    System.out.println("**Hard**");
                    System.out.println("Guess the Number (1-100)");
                    Diff hard = new Diff(12);
                    hard.guessIt(100);
                }
                case 4 -> {
                    System.out.println("**Pro**");
                    System.out.println("Guess the Number (1-500)");
                    Diff pro = new Diff(20);
                    pro.guessIt(500);
                }
                case 5 -> System.out.println("Exit");
            }
        }while(choice!=5);
    }
}