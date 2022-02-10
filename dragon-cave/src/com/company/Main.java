package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you,\n");
        System.out.println("you see two caves. In one cave, the dragon is friendly\n");
        System.out.println("and will share his treasure with you. The other dragon\n");
        System.out.println("is greedy and hungry and will eat you on sight.\n");
        System.out.println("Which cave will you go into?(1 or 2)\n");




                        String cave = scanner.nextLine();
                        int ansr = Integer.parseInt(cave);

                        if(ansr==1){
                            System.out.println("You approach the cave...\n");
                            System.out.println("It is dark and spooky...\n");
                            System.out.println("A large dragon jumps out in front of you! He opes his jaws and...\n");
                            System.out.println("Gobbles you down in one bite!\n");
                           // error = false;
                        }else if(ansr==2){
                            System.out.print("You're rich now.");
                           // error = false;
                        }


















    }
}
