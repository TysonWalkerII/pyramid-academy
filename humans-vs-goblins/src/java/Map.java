import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Map {
    public static int dim = 0;
    class Row{
        ArrayList<Terrain> gameRow = new ArrayList<>();
        public Row(int size, int y){
            IntStream.range(0, size).forEach(x -> gameRow.add(new Land(x ,y)));
        }
        @Override
        public String toString(){
            return String.join(" ",gameRow.stream().map(String::valueOf).toList());
        }
    }

    ArrayList<Row> gameBoard = new ArrayList<>();
    ArrayList<Humanoid> entities= new ArrayList<>();
    ArrayList<Terrain> alteredTerrain = new ArrayList<>();

    public String fight(int x, int y, int gx, int gy) {
        String ansr = null;
        if (x == gx && y == gy) {
            ansr = "";
            int min = 1;
            int max = 10;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            if (random_int <= 5) {
                ansr = "You Won!YAYAYAYAYAYAY";
            } else {
                ansr = "usuc";
            }
        }
        return ansr;
    }



    public Map addEntity(Humanoid humanoid){
        entities.add(humanoid);
        return this;
    }

    public Map updateState(){
        alteredTerrain.forEach(Terrain::reset);
        alteredTerrain.clear();
        for (Humanoid entity : entities) {
            var t = getTerrain(entity.x, entity.y);
            alteredTerrain.add(t);
            t.setState(entity.toString());
        }
        return this;
    }


    public Map(int d){
        dim = d;
        IntStream.rangeClosed(0, d).forEach(y -> gameBoard.add(new Row(d, y)));
    }

    @Override
    public String toString() {
        return String.join("\n", gameBoard.stream().map(String::valueOf).toList());
    }

    public Terrain getTerrain(int x, int y){
        return gameBoard.get(x).gameRow.get(y);
    }

    public static void main(String[] args) {


        try{
            var map = new Map(10);
            boolean isNotWinner = true;
            var gobby = new Goblin(5, 5);
            var player = new Human(3, 2);
            map.addEntity(player);
            map.addEntity(gobby);
            map.updateState();
            System.out.println(map);
            boolean tii = false;
            while(tii== false){
                Scanner scanner = new Scanner(System.in);
                String move = "";
                move = scanner.next();
                if (move.equals("a")) {
                    player.moveNorth();
                    System.out.println(map.fight(player.x, player.y, gobby.x, gobby.y));
                    if(map.fight(player.x, player.y, gobby.x, gobby.y) == "You Won!YAYAYAYAYAYAY" || map.fight(player.x, player.y, gobby.x, gobby.y) == "usuc"){
                        tii =true;
                    }
                } else if (move.equals("w")) {
                    player.moveWest();
                    System.out.println(map.fight(player.x, player.y, gobby.x, gobby.y));
                    if(map.fight(player.x, player.y, gobby.x, gobby.y) == "You Won!YAYAYAYAYAYAY" || map.fight(player.x, player.y, gobby.x, gobby.y) == "usuc"){
                        tii =true;
                    }
                } else if (move.equals("d")) {
                    player.moveSouth();
                    System.out.println(map.fight(player.x, player.y, gobby.x, gobby.y));
                    if(map.fight(player.x, player.y, gobby.x, gobby.y) == "You Won!YAYAYAYAYAYAY" || map.fight(player.x, player.y, gobby.x, gobby.y) == "usuc"){
                        tii =true;
                    }
                } else if (move.equals("s")) {
                    player.moveEast();
                    System.out.println(map.fight(player.x, player.y, gobby.x, gobby.y));
                    if(map.fight(player.x, player.y, gobby.x, gobby.y) == "You Won!YAYAYAYAYAYAY" || map.fight(player.x, player.y, gobby.x, gobby.y) == "usuc"){
                        tii =true;
                    }
                }
                if(map.fight(player.x, player.y, gobby.x, gobby.y) != "You Won!YAYAYAYAYAYAY" && map.fight(player.x, player.y, gobby.x, gobby.y) != "usuc"){
                    map.updateState();
                    System.out.print(map);
                }
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
