public class Terrain implements Movement{
    private int x;
     private int y;
     private String state;

     public Terrain(int x, int y){
         this.x = x;
         this.y = y;
     }



    public int getx(){
       return x;
    }

    private void setx(int x) {
        this.x = x;
    }

    public int gety(){
         return y;
    }

    public void setY(int y){
        this.y =y;
    }

    @Override
    public String toString() {
        return state;
    }

    public void setState(String str) {
         this.state = str;
    }

    public void reset(){
        this.state = "\uD83C\uDF32";
    }

}




