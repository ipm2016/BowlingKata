package strategy;

import lombok.Setter;

import java.util.List;

@Setter
public class StrikeBonus implements Bonus {

    @Override
    public int getValue(List<Turn> turnList, int turnNumber) {
        return turnList.get(++turnNumber).getScore();
    }
}
