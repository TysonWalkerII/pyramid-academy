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
    void greeting() {
        assertEquals("Hello! What is your name?\n",main.Greeting(),"Something went wrong with the greeting.\n");
    }

    @Test
    void validate() {
        assertTrue(main.validate("bob"));
        assertFalse(main.validate("b4b"));
    }

    @Test
    void challenge() {
assertEquals("Well,porkii I am thinking of a number between 1 and 20.\nTake a guess.\n",main.challenge("porkii"),"Something went wrong with the challenge method.");
    }

    @Test
    void guessCheck() {
        assertEquals("You have to guess with a number from 1 to 20.\n",main.guessCheck("pkdsfl"),"Something went wrong with the guessCheck method.");
    }

    @AfterEach
    void tearDown() {
    }
}