import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String letter = "";
    public static String watsleft="";
    public static String[] randomWords = { "Terminator", "Slicer","Ninja", "cow", "Robot", "littlegirl" };
    public static String wordToGuess = randomWords[(int) (Math.random() * randomWords.length)];
    private static String underscores = new String(new char[wordToGuess.length()]).replace("\0", "_");
    public static ArrayList<String> missedLetters = new ArrayList<String>();
    public static ArrayList<String> wrdarr = new ArrayList<String>(Arrays.asList(wordToGuess));
    public static int howManyWrong = 0;


    public String randomWordGenerator() {








        return null;
    }



    public static void hangImage(){
        if (howManyWrong == 0) {
            System.out.print(" +---+\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n");
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");


        }

        if (howManyWrong == 1) {
            System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");


        }

        if (howManyWrong == 2) {
            System.out.println(" +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");


        }
        if (howManyWrong == 3) {
            System.out.println(" +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");

        }
        if (howManyWrong == 4) {
            System.out.println(" +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");


        }
        if (howManyWrong == 5) {
            System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========");
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");


            System.out.println("You lost, the word was " + wordToGuess);
        }
        if (howManyWrong == 6) {
            System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "=========");
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");

            System.out.println("GAME OVER! The word was " + wordToGuess);
        }

    }

    public static void main(String[] args) {
        Main method1 = new Main();
        //-----------------------------------------------------------------------

        System.out.println("H A N G M A N\n");
        while(howManyWrong<7 && underscores.contains("_")){
            method1.hangImage();
            Scanner letter = new Scanner(System.in);
            String guess = letter.next();
            String newunderscore = "";
            int dubplicate = 0;
            for(int i = 0;i<wordToGuess.length();i++){
                if(guess.charAt(0) == wordToGuess.charAt(i)){
                    newunderscore+=guess.charAt(0);
                }else if(underscores.charAt(i) != '_'){
                    newunderscore += wordToGuess.charAt(i);
                }else if(!missedLetters.contains(guess) && !wordToGuess.contains(guess)){
                    missedLetters.add(guess);
                    newunderscore += "_";
                }else if(missedLetters.contains(guess) && wordToGuess.contains(guess)){
                    newunderscore += "_";

                }
                else{
                    newunderscore += "_";

                }
            }
            if(newunderscore.contains(String.valueOf(guess.charAt(0)))){
                boolean check = false;

               do{
                    System.out.print("U did that already");
                    Scanner scanner = new Scanner(System.in);
                    String adjustment = scanner.nextLine();

                    if(adjustment != (String.valueOf(guess.charAt(0)))){
                        check =true;
                    }else{
                        check =false;
                    }
                } while(check == true);




            }

            if(underscores.equals(newunderscore)){
                howManyWrong++;
                System.out.print("problem here");
            }else{
                underscores =newunderscore;
            }
            if(underscores.equals(wordToGuess)){
                System.out.print("Yes! The secret word is "+underscores+"! You have won!");
                System.out.print("Do you want to play again?(yes or no)");
            }
        }

     //   System.out.print(" +---+\n" +
     //           "      |\n" +
    //            "      |\n" +
     //           "      |\n" +
     //           "      |\n" +
      //          "      |\n");
     //   System.out.println("Missed Letters:"+missedLetters);
     //   System.out.println("Guess a letter\n");
     //   System.out.println(underscores);
      //  System.out.println(wordToGuess);




        //-----------------------------------------------------------------------
         //   String newunderscore = "";

      //  for(int i = 0;i<wordToGuess.length();i++){



       //     if(guess.charAt(0) == wordToGuess.charAt(i)){
       //         newunderscore+=wordToGuess.charAt(0);
       //     }else if(underscores.charAt(i) != '_'){
      //          underscores += wordToGuess.charAt(i);
       //     }else{
               // newunderscore += "_";
      //          while(!missedLetters.contains(guess))
       //         missedLetters.add(guess);

       //     }
       // }






     //   if(underscores.equals(newunderscore)){
     //       howManyWrong++;


    //    }else{
     //       underscores =newunderscore;
     //   }
     //   if(underscores.equals(wordToGuess)){
      //      System.out.print("Yes! The secret word is "+underscores+"! You have won!");
        //    System.out.print("Do you want to play again?(yes or no)");
       // }








       // System.out.print("word array"+wrdarr);
       // Scanner scanner = new Scanner(System.in);
       // letter  = scanner.next();
       // underscores.clear();
       // if(wordToGuess.contains(letter)){
       //     for(int j = 0;j<=wrdarr.size();j++){
       //         System.out.print("specific letter to get"+wrdarr.get(j));
      //          System.out.print("letter that I guessed"+letter);
                //if(letter == wrdarr.get(j)){
      //          underscores.add(letter);
               // }else{
      //          underscores.add("_");
                //}
      //      }

        //    }else{
       //     missedLetters.add(letter);
       // }
      //  System.out.print(missedLetters);

     //   System.out.print(wTGSplit);







    }



}
