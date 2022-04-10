import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Game {


   private List<Turn> frames;


    public int getFinalScore(){
        return frames.stream().map(t -> (t.getScore() + this.getBonus(t))).limit(10).reduce(Integer::sum).get();
    }

     public int getBonus(Turn t){
        Bonus bonus=null;
        int pos = this.getFrames().indexOf(t);
        if(t.isEligibleBonusSpare()){
            bonus = new SpareBonus();
        }else if(t.isEligibleBonusStrike()){
                bonus = new StrikeBonus();
        }
        if(bonus!=null){
            return bonus.getValue(this.getFrames(),this.getFrames().indexOf(t));

        }else {
            return 0;
        }
     }

}
