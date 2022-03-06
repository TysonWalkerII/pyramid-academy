public class Humanoid {
    int x;
    int y;

    public Humanoid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void correctMove(){
        if(x >= Map.dim-1){
            this.x = Map.dim-1;
        }
        if(x < 0){
            this.x =0;
        }
        if(y >= Map.dim-1){
            this.y = Map.dim;
        }
        if(y <0){
            this.y = 0;
        }
    }

    public Humanoid moveNorth(){
        this.y -=1;
        correctMove();
         return this;
    }

    public Humanoid moveSouth(){
        this.y+= 1;
        correctMove();
        return this;
    }

    public Humanoid moveEast(){
        this.x +=1;
        correctMove();
        return this;
    }

    public Humanoid moveWest(){
        this.x -=1;
        correctMove();
        return this;
    }

}
