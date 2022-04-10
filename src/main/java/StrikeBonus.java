import lombok.Setter;

import java.util.List;

@Setter
public class StrikeBonus implements Bonus {

    @Override
    public int getBonus(List<Turn> gameList, int turn) {
        return gameList.get(++turn).getScore();
    }
}
