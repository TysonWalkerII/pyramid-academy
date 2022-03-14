import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String[] randomWords = { "Terminator", "Slicer","Ninja", "cow", "Robot", "littlegirl" };
    public static String wordToGuess = randomWords[(int) (Math.random() * randomWords.length)];
    private static String underscores = new String(new char[wordToGuess.length()]).replace("\0", "_");
    public static ArrayList<String> missedLetters = new ArrayList<String>();
    public static int highscore = 0;
    public static int howManyWrong = 0;
    public static String newunderscore = "";
    public static String choicemade = "yes";
    public static int highscorefrfr =0;
    public static Scanner letter = new Scanner(System.in);





    public static void hangImage(){
       if(howManyWrong ==0){
            Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
            try {
              List<String> lineidk = Files.readAllLines(path);
                  System.out.println(lineidk.get(2));
                  System.out.println(lineidk.get(3));
                  System.out.println(lineidk.get(4));
                  System.out.println(lineidk.get(5));
                  System.out.println(lineidk.get(6));
                  System.out.println(lineidk.get(7));
                  System.out.println(lineidk.get(8));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");
        }else if(howManyWrong ==1){
            Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
            try {
                List<String> lineidk = Files.readAllLines(path);
                System.out.println(lineidk.get(9));
                System.out.println(lineidk.get(10));
                System.out.println(lineidk.get(11));
                System.out.println(lineidk.get(12));
                System.out.println(lineidk.get(13));
                System.out.println(lineidk.get(14));
                System.out.println(lineidk.get(15));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");
        }else if(howManyWrong ==2){
            Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
            try {
                List<String> lineidk = Files.readAllLines(path);

                System.out.println(lineidk.get(16));
                System.out.println(lineidk.get(17));
                System.out.println(lineidk.get(18));
                System.out.println(lineidk.get(19));
                System.out.println(lineidk.get(20));
                System.out.println(lineidk.get(21));
                System.out.println(lineidk.get(22));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");
        }else if(howManyWrong ==3){
            Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
            try {
                List<String> lineidk = Files.readAllLines(path);

                System.out.println(lineidk.get(23));
                System.out.println(lineidk.get(24));
                System.out.println(lineidk.get(25));
                System.out.println(lineidk.get(26));
                System.out.println(lineidk.get(27));
                System.out.println(lineidk.get(28));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");
        }else if(howManyWrong ==4){
            Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
            try {
                List<String> lineidk = Files.readAllLines(path);
                System.out.println(lineidk.get(29));
                System.out.println(lineidk.get(30));
                System.out.println(lineidk.get(31));
                System.out.println(lineidk.get(32));
                System.out.println(lineidk.get(33));
                System.out.println(lineidk.get(34));
                System.out.println(lineidk.get(35));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");
        }else if(howManyWrong ==5){
            Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
            try {
                List<String> lineidk = Files.readAllLines(path);

                System.out.println(lineidk.get(36));
                System.out.println(lineidk.get(37));
                System.out.println(lineidk.get(38));
                System.out.println(lineidk.get(39));
                System.out.println(lineidk.get(40));
                System.out.println(lineidk.get(41));
                System.out.println(lineidk.get(42));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");
        }else if(howManyWrong ==6){
            Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
            try {
                List<String> lineidk = Files.readAllLines(path);
                System.out.println(lineidk.get(43));
                System.out.println(lineidk.get(44));
                System.out.println(lineidk.get(45));
                System.out.println(lineidk.get(46));
                System.out.println(lineidk.get(47));
                System.out.println(lineidk.get(48));
                System.out.println(lineidk.get(49));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Missed letters:\n"+missedLetters);
            System.out.println(underscores);
            System.out.println("Guess a letter.");
        }
     //  else if(howManyWrong ==7){
      //      Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
      //      try {
      //          List<String> lineidk = Files.readAllLines(path);

//                System.out.println(lineidk.get(50));
//                System.out.println(lineidk.get(51));
  //              System.out.println(lineidk.get(52));
    //            System.out.println(lineidk.get(53));
      //          System.out.println(lineidk.get(54));
      //          System.out.println(lineidk.get(55));
      //          System.out.println(lineidk.get(56));
      //      } catch (IOException e) {
      //          e.printStackTrace();
      //      }
      //      System.out.println("Missed letters:\n"+missedLetters);
      //      System.out.println(underscores);
      //      System.out.println("Guess a letter.");
      //  }
    }
    public static void runGame(){
        System.out.println("H A N G M A N\n");
        do{
            letsGuess();

        }while(choicemade.equals("yes"));
    }


    public static void letsGuess(){
        Path highscorepath = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//Highscore.text");
        System.out.println("Your highscore is currently: "+highscorefrfr);
        hangImage();
        newunderscore="";
         letter = new Scanner(System.in);
            String guess = letter.next();
        String[] wtg= wordToGuess.split("");
        if(underscores.contains(guess)||missedLetters.contains(guess)){
            System.out.println("You already guessed that ");
            redo();
        }
        System.out.println("GUESS"+guess+"UNDERSCORE"+underscores+"MISSED STUFF"+missedLetters);
        Arrays.stream(wtg).forEach(n->{
            if(guess.equals(n)){
            newunderscore += guess;
        }else if(underscores.charAt(wordToGuess.indexOf(n)) != '_'){
                highscore+=1;
            newunderscore += wordToGuess.charAt(wordToGuess.indexOf(n));
        }else if(!missedLetters.contains(guess) && !wordToGuess.contains(guess)){
            missedLetters.add(guess);
            newunderscore+="_";
        }else if(missedLetters.contains(guess) && wordToGuess.contains(guess)){
            newunderscore += "_";
        }else{
            newunderscore += "_";
        }});
        //------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        if(underscores.equals(newunderscore)){
            howManyWrong++;
            highscore-=1;
        }else{
            underscores =newunderscore;
        }
        //---------------------------------------------------------------------------------------------------------
        if((howManyWrong>=7)||!underscores.contains("_")){
            System.out.println("NOTICED!!!"+underscores);
            if(underscores.equals(wordToGuess)){
                System.out.println("Yes! The secret word is "+underscores+"! You have won!");
                System.out.println("Continue?");
                Scanner scanner = new Scanner(System.in);
                choicemade = scanner.next();
                wordToGuess = randomWords[(int) (Math.random() * randomWords.length)];
                underscores = new String(new char[wordToGuess.length()]).replace("\0", "_");
                howManyWrong=0;
                missedLetters.clear();
            }else{
                Path path = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//src//recources//hangman.text");
                try {
                    List<String> lineidk = Files.readAllLines(path);
                    System.out.println(lineidk.get(50));
                    System.out.println(lineidk.get(51));
                    System.out.println(lineidk.get(52));
                    System.out.println(lineidk.get(53));
                    System.out.println(lineidk.get(54));
                    System.out.println(lineidk.get(55));
                    //  System.out.println(lineidk.get(56));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Missed letters:\n"+missedLetters);
                System.out.println(underscores);
                System.out.println("Guess a letter.");
                System.out.println("GAME OVER! The word was " + wordToGuess);
                System.out.println("Continue?");
                Scanner scanner = new Scanner(System.in);
                choicemade = scanner.next();
                wordToGuess = randomWords[(int) (Math.random() * randomWords.length)];
                underscores = new String(new char[wordToGuess.length()]).replace("\0", "_");
                howManyWrong=0;
                missedLetters.clear();
            }
        }
    }
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner namesc = new Scanner(System.in);
        String name = namesc.next();
        File testthing = new File("C://Users//tywal//IdeaProjects//hangmanfunctional//"+name);
        if(testthing.exists()){
            Path hifrfr = Paths.get("C://Users//tywal//IdeaProjects//hangmanfunctional//"+name);
            try {
                List<String> gettingthehighscore = Files.readAllLines(hifrfr);
                highscorefrfr = Integer.parseInt(gettingthehighscore.get(0));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }






        try {
            FileWriter filethingy = new FileWriter(name);
            runGame();
            if(highscore>highscorefrfr){
                filethingy.write(String.valueOf(highscore));
                System.out.println("Amazing... you just got a new highscore!!!"+highscore);
            }else{
                filethingy.write(String.valueOf(highscorefrfr));
            }
            filethingy.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }




        public static void redo (){
            Scanner redo = new Scanner(System.in);

            String redoansr = redo.next();

            if(letter.equals(redo.next())){
                redo.next().equals("");
                redo();
            }else if(!letter.equals(redo.next())){            letter.equals(redo.next());
            }
        }
}