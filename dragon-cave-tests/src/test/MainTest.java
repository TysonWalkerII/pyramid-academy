
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }


    @Test
    void intro() {
        assertEquals("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight. Which cave will you go into?(1 or 2)",main.intro(),"Something is wrong with the intro.");
    }

    @Test
    void result() {
        assertEquals("You're rich now.",main.result("2"),"didn't recieve 1 or 2" );
        assertEquals("You approach the cave...It is dark and spooky...A large dragon jumps out in front of you! He opes his jaws and...Gobbles you down in one bite!",main.result("1"),"didn't recieve 1 or 2." );
    }






    @AfterEach
    void tearDown() {
    }



}