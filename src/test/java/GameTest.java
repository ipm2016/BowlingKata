import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

class GameTest {

    @Test
    void getScoreCase1() {

        Turn turn1 = new Turn(5,5);
        Turn turn2 = new Turn(1,1);
        Turn turn3 = new Turn(1,1);
        Turn turn4 = new Turn(1,1);
        Turn turn5 = new Turn(1,1);Turn turn8 = new Turn(1,1);
        Turn turn6 = new Turn(1,1);Turn turn9 = new Turn(1,1);
        Turn turn7 = new Turn(1,1);Turn turn10 = new Turn(1,1);
        List<Turn> turns = Arrays.asList(turn1,turn2,turn3,turn4,turn5,turn6,turn7,turn8,turn9,turn10);

        Game game = new Game();
        game.setFrames(turns);

        int result = game.getFinalScore();

        Assertions.assertEquals(29,result);
    }

    @Test
    void getScoreCase2() {

        Turn turn1 = new Turn(1,1);
        Turn turn2 = new Turn(1,1);
        Turn turn3 = new Turn(1,1);
        Turn turn4 = new Turn(1,1);
        Turn turn5 = new Turn(1,1);
        Turn turn8 = new Turn(1,1);
        Turn turn6 = new Turn(1,1);
        Turn turn9 = new Turn(1,1);
        Turn turn7 = new Turn(1,1);
        Turn turn10 = new Turn(6,4);
        Turn bonusTurn = new Turn(1,0);
        List<Turn> turns = Arrays.asList(turn1,turn2,turn3,turn4,turn5,turn6,turn7,turn8,turn9,turn10,bonusTurn);

        Game game = new Game();
        game.setFrames(turns);

        int result = game.getFinalScore();

        Assertions.assertEquals(29,result);
    }

    @Test
    void getScoreCase3() {

        Turn turn1 = new Turn(1,1);
        Turn turn2 = new Turn(1,1);
        Turn turn3 = new Turn(1,1);
        Turn turn4 = new Turn(1,1);
        Turn turn5 = new Turn(1,1);
        Turn turn8 = new Turn(1,1);
        Turn turn6 = new Turn(1,1);
        Turn turn9 = new Turn(1,1);
        Turn turn7 = new Turn(1,1);
        Turn turn10 = new Turn(10,0);
        Turn bonusTurn = new Turn(1,1);
        List<Turn> turns = Arrays.asList(turn1,turn2,turn3,turn4,turn5,turn6,turn7,turn8,turn9,turn10,bonusTurn);

        Game game = new Game();
        game.setFrames(turns);

        int result = game.getFinalScore();

        Assertions.assertEquals(30,result);
    }

    @Test
    void getScoreCase4() {

        Turn turn1 = new Turn(10,0);
        Turn turn2 = new Turn(1,1);
        Turn turn3 = new Turn(1,1);
        Turn turn4 = new Turn(1,1);
        Turn turn5 = new Turn(1,1);
        Turn turn8 = new Turn(1,1);
        Turn turn6 = new Turn(1,1);
        Turn turn9 = new Turn(1,1);
        Turn turn7 = new Turn(1,1);
        Turn turn10 = new Turn(1,1);
        List<Turn> turns = Arrays.asList(turn1,turn2,turn3,turn4,turn5,turn6,turn7,turn8,turn9,turn10);

        Game game = new Game();
        game.setFrames(turns);

        int result = game.getFinalScore();

        Assertions.assertEquals(30,result);
    }

    @Test
    void getScoreCase5() {

        Turn turn1 = new Turn(1,1);
        Turn turn2 = new Turn(1,1);
        Turn turn3 = new Turn(1,1);
        Turn turn4 = new Turn(1,1);
        Turn turn5 = new Turn(1,1);
        Turn turn8 = new Turn(1,1);
        Turn turn6 = new Turn(1,1);
        Turn turn9 = new Turn(1,1);
        Turn turn7 = new Turn(1,1);
        Turn turn10 = new Turn(1,1);
        List<Turn> turns = Arrays.asList(turn1,turn2,turn3,turn4,turn5,turn6,turn7,turn8,turn9,turn10);

        Game game = new Game();
        game.setFrames(turns);

        int result = game.getFinalScore();

        Assertions.assertEquals(20,result);
    }

}