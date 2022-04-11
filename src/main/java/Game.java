import lombok.Data;
import lombok.NoArgsConstructor;
import strategy.Bonus;
import strategy.SpareBonus;
import strategy.StrikeBonus;
import strategy.Turn;

import java.util.List;

@Data
@NoArgsConstructor
public class Game {


   private List<Turn> turnList;


    public int getFinalScore(){
        //se limiter à 10 pour ne pas appliquer les régles de Strike et spare pour les bonus throws
        return turnList.stream().map(t -> (t.getScore() + this.getBonus(t))).limit(10).reduce(Integer::sum).get();
    }

     private int getBonus(Turn t){
        Bonus bonus=null;
        int pos = this.getTurnList().indexOf(t);
        if(t.isEligibleBonusSpare()){
            bonus = new SpareBonus();
        }else if(t.isEligibleBonusStrike()){
                bonus = new StrikeBonus();
        }
        if(bonus!=null){
            return bonus.getValue(this.getTurnList(),this.getTurnList().indexOf(t));

        }else {
            return 0;
        }
     }

}
