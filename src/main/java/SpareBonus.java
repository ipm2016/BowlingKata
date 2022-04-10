import lombok.Data;

import java.util.List;

@Data
public class SpareBonus implements Bonus {

    @Override
    public int getBonus(List<Turn> gameList, int turn) {
            return gameList.get(++turn).getFirstThrow();
    }
}
