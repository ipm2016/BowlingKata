package strategy;

import java.util.List;

public interface Bonus {

    int getValue(List<Turn> turnList, int turnNumber);
}
