import java.util.Scanner;
public class Main {

    public String intro(){
        return "You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight. Which cave will you go into?(1 or 2)";
    }


        public String result( String cave){

            String rtrn = "";

            boolean error = false;
            do{
                try{

                    //String cave = scanner.nextLine();
                    int ansr = Integer.parseInt(cave);

                    if(ansr==1){
                        rtrn= "You approach the cave...It is dark and spooky...A large dragon jumps out in front of you! He opes his jaws and...Gobbles you down in one bite!";
                        error = false;
                    }else if(ansr==2){
                        rtrn= "You're rich now.";
                        error = false;
                    }else if(ansr !=1 && ansr !=2){
                        rtrn= "You have to pick a cave with 1 or 2";
                        error= true;
                    }

                }catch(Exception e){
                    rtrn= "You have to pick a cave with 1 or 2";
                    error= true;
                }
            }while(error ==true);


            return rtrn;
        }




    public static void main(String[] args) {
        Main porkii = new Main();
        Main method = new Main();

        // write your code here
        Scanner scanner = new Scanner(System.in);


      System.out.println(porkii.intro());

        String cave = scanner.nextLine();
        System.out.println(method.result(cave));











    }
}