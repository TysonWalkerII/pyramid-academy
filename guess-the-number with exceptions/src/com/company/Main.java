package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        String decision = "y";


        System.out.println("Hello! What is your name?\n");
        while (decision != "n"){








                    boolean isValid = false;
            String name="" ;

            while(!isValid){
                try{



                    name = scanner.next();

                    for(int i = 0; i< name.length(); i++){
                        char ch = name.charAt(i);
                        if(ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9' || ch=='0'){

                            throw new Exception("Not a valid name");
                        }
                    }
                    isValid=true;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

            }




























            int min = 1;
            int max = 20;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

            System.out.println("Well, " + name + " I am thinking of a number between 1 and 20.\n");
            System.out.println("Take a guess.\n");






            int guess = 0;
            boolean error = false;
            do{
                error = false;
                try{
                    guess = scanner.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Guess a number from 1 to 6");
                    error = true;
                    scanner.next();
                }

            }while(error);



                for (int i = 5; i > 0; i--) {
                    if (guess == random_int) {


                        int numofg = 6 - i;

                        System.out.println("Good job, " + name + "! You guessed my number in " + numofg + " guesses!.\n");
                        break;

                    } else if (guess < random_int) {





                        System.out.print("Your guess is too low.");
                        System.out.println("Take a guess.\n");
                        do{
                            error = false;
                            try{



                                guess = scanner.nextInt();
                            }catch(InputMismatchException e){
                                System.out.println("Guess a number from 1 to 6");
                                error = true;
                                scanner.next();
                            }

                        }while(error);




                    } else {

                        System.out.print("Your guess is too high.");
                        System.out.println("Take a guess.\n");


                        do{
                            error = false;
                            try{


                                guess = scanner.nextInt();
                            }catch(InputMismatchException e){
                                System.out.println("Guess a number from 1 to 6");
                                error = true;
                                scanner.next();
                            }

                        }while(error);


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