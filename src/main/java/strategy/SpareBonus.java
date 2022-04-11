package strategy;

import lombok.Data;

import java.util.List;

@Data
public class SpareBonus implements Bonus {

    @Override
    public int getValue(List<Turn> turnList, int turnNumber) {
            return turnList.get(++turnNumber).getFirstThrow();
    }
}
