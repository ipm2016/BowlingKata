import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TurnTest {


    @Test
    void getScore() {
        Turn turn = new Turn(10,0);
        int result = turn.getScore();
        Assertions.assertEquals(10,result);
    }

}