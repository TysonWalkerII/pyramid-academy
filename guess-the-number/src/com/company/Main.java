package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        String decision = "y";



        while (decision != "n"){

            System.out.println("Hello! What is your name?\n");
            String name = scanner.next();

            int min = 1;
            int max = 20;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

            System.out.println("Well, " + name + " I am thinking of a number between 1 and 20.\n");
            System.out.println("Take a guess.\n");
            int guess = Integer.parseInt(scanner.next());

            for (int i = 5; i > 0; i--) {
                if (guess == random_int) {
                    int numofg = 6 - i;

                    System.out.println("Good job, " + name + "! You guessed my number in " + numofg + " guesses!.\n");
                    break;

                } else if (guess < random_int) {
                    System.out.print("Your guess is too low.");
                    System.out.println("Take a guess.\n");
                    guess = Integer.parseInt(scanner.next());

                } else {
                    System.out.print("Your guess is too high.");
                    System.out.println("Take a guess.\n");
                    guess = Integer.parseInt(scanner.next());


                }


            }

            System.out.println("Would you like to play again? (y or n)\n");
            decision = scanner.next();
            if (decision.equals("n")) {
                break;
            }


        }


    }

}