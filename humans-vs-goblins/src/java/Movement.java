public interface Movement {
    Position pos = new Position();
    default void move(){
        pos.x +=55;
    }

}
