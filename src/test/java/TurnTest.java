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

    @Test
    void checkForBonusTest(){
        Turn t = new Turn(3,7);
        t.checkForBonus();
        Assertions.assertTrue(t.isEligibleBonusSpare());
    }

    @Test
    void checkForBonusTest2(){
        Turn t = new Turn(10,0);
        t.checkForBonus();
        Assertions.assertTrue(t.isEligibleBonusStrike());
    }

    @Test
    void checkForBonusTest3(){
        Turn t = new Turn(2,6);
        t.checkForBonus();
        Assertions.assertFalse(t.isEligibleBonusStrike());
        Assertions.assertFalse(t.isEligibleBonusSpare());
    }

}