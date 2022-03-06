import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    Map map;

    @BeforeEach
    void setUp() {
        map = new Map(10);
    }
    @Test
    void fight(){
        int random_Int = 6;
        assertTrue(random_Int>=5,"You Won!YAYAYAYAYAYAY");
         random_Int = 3;
        assertTrue(random_Int<=5,"usuc");
    }

    @AfterEach
    void tearDown() {
    }
}